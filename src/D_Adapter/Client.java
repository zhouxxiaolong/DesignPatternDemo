package D_Adapter;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/10/9
 * Contact with 1016579848@qq.com
 *
 * @link
 */
public class Client {

    public static void main(String[] args) {
        Iphone iphone6Plus = new Iphone(new IphoneHeadset());
        Adapter adapter  = new Adapter(new SimpleHeadset());
        Iphone iphone7 = new Iphone(adapter);

        System.out.println("=====iphone6Plus使用原装耳机====");
        iphone6Plus.playMusic();
        System.out.println("==============================");

        System.out.println("===iphone7使用一般3.5mm口耳机====");
        iphone7.playMusic();
        System.out.println("==============================");


    }
}
