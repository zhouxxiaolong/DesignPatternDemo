package A_factory.abstractfactory;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/10/6
 * Contact with 1016579848@qq.com
 *
 * @link
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
