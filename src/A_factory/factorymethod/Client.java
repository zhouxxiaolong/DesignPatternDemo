package A_factory.factorymethod;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/9/27
 * Contact with 1016579848@qq.com
 *
 * @link
 */
public class Client {
    public static void main(String[] args) {
        Factory paperFactory = new PaperFactory();
        ShapeProduct paperCircleShape = paperFactory.create("Circle");
        paperCircleShape.drawColor();
    }
}
