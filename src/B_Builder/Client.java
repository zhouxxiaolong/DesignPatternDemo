package B_Builder;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/10/8
 * Contact with 1016579848@qq.com
 *
 * @link
 */
public class Client {
    public static void main(String[] args) {
        Builder iPhoneBuilder = new IPhoneBuilder();
        Director director = new Director(iPhoneBuilder);
        director.construct();
        Phone product = iPhoneBuilder.create();
        System.out.println(product.toString());
    }
}
