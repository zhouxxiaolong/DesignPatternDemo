package A_factory.factorymethod;

import java.util.*;

/**
 *
 */
public class PlasticFactory implements Factory {

    @Override
    public ShapeProduct create(String type) {
        if ("Circle".equals(type)) {
            return new PlasticCircleShape();
        } else if ("Rect".equals(type)) {
            return new PlasticRectShape();
        } else if ("Triangle".equals(type)) {
            return new PlasticTriangleShape();
        } else {
            throw new RuntimeException("不能生产该形状塑料");
        }
    }
}