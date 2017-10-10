package A_factory.factorymethod;

import java.util.*;

/**
 *
 */
public class PaperFactory implements Factory {

    @Override
    public ShapeProduct create(String type) {
        if ("Circle".equals(type)) {
            return new PaperCircleShape();
        } else if ("Rect".equals(type)) {
            return new PaperRectShape();
        } else if ("Triangle".equals(type)) {
            return new PaperTriangleShape();
        } else {
            throw new RuntimeException("不能生产该形状纸片");
        }
    }
}