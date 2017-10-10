package A_factory.abstractfactory;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/10/6
 * Contact with 1016579848@qq.com
 *
 * @link
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}

