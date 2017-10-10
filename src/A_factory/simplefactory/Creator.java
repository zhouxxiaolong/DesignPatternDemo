package A_factory.simplefactory;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/9/24
 * Contact with 1016579848@qq.com
 *
 * @link
 */
class Creator {

    public static ShapeProduct simpleFactory(String fruitType) {

        if ("CircleShape".equals(fruitType)) {
            return new CircleShape();
        } else if ("RectShape".equals(fruitType)) {
            return new RectShape();
        } else if ("TriangleShape".equals(fruitType)) {
            return new TriangleShape();
        } else {
            throw new RuntimeException("不能生产该形状纸片");
        }
    }

}
