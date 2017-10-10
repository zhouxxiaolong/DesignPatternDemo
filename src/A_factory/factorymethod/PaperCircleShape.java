package A_factory.factorymethod;

import java.util.*;

/**
 *
 */
public class PaperCircleShape implements ShapeProduct {

    @Override
    public void drawColor() {
        System.out.println("红色圆形纸片");
    }
}