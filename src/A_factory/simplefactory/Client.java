package A_factory.simplefactory;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/9/24
 * Contact with 1016579848@qq.com
 *
 * @link
 */
public class Client {
    public static void main(String[] args) {
        ShapeProduct circleShape = Creator.simpleFactory("CircleShape");
        circleShape.drawColor();
    }
}
