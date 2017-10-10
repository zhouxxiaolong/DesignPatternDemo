package A_factory.factorymethod;

import java.util.*;

/**
 * 
 */
public class PlasticRectShape implements ShapeProduct {

    @Override
    public void drawColor() {
        System.out.println("蓝色矩形塑料");
    }
}