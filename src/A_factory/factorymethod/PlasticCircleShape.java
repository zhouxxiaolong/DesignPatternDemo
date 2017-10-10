package A_factory.factorymethod;

import java.util.*;

/**
 * 
 */
public class PlasticCircleShape implements ShapeProduct {

    @Override
    public void drawColor() {
        System.out.println("红色圆形塑料");
    }
}