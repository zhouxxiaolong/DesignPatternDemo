package A_factory.factorymethod;

import java.util.*;

/**
 * 
 */
public class PaperTriangleShape implements ShapeProduct {


    @Override
    public void drawColor() {
        System.out.println("黄色三角形纸片");
    }
}