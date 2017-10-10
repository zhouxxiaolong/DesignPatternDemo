package C_Singleton;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/10/8
 * Contact with 1016579848@qq.com
 *
 * @link
 */
public class Singleton {

    // 私有化构造器，外部不能生成实例
    // 所有形式的单例模式，前提都是私有化构造函数
    private Singleton() {

    }

    ///******************************************
    ///****************饿汉式*********************
    ///***优点：简单
    ///***缺点：一旦类被加载，单例就会初始化，没有实现懒加载。
    ///        而且当实现了Serializable接口后，反序列化时单例会被破坏。
    ///******************************************
    private static final Singleton INSTANCE_E = new Singleton();

    public static Singleton getInstance_e() {
        return INSTANCE_E;
    }


    ///******************************************
    ///****************懒汉式1********************
    ///***优点：写法简单,实现懒加载用的时候才初始化
    ///***缺点：多线程并行的时候，就会创建多个实例。
    ///******************************************
    private static Singleton instance_lan1;

    public static Singleton getInstance_lan1() {
        // 懒汉式创建实例对象，但是多线程并行的时候，就会创建多个实例。
        if (instance_lan1 == null) {
            instance_lan1 = new Singleton();
        }
        return instance_lan1;
    }

    ///******************************************
    ///****************懒汉式2********************
    ///***优点：写法简单,实现懒加载用的时候才初始化,多线程并行的时候，就不会创建多个实例
    ///***缺点：影响效率，因为在任何时候只能有一个线程调用 getInstance_lan2() 方法。
    ///******************************************
    private static Singleton instance_lan2;

    public static synchronized Singleton getInstance_lan2() {
        if (instance_lan2 == null) {
            instance_lan2 = new Singleton();
        }
        return instance_lan2;
    }

    ///******************************************
    ///****************静态内部类******************
    ///***优点：不会出现线程问题，可以实现延迟加载。完美。这种方法也是《Effective Java》上所推荐的。
    ///******************************************
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
