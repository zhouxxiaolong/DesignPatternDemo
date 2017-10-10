package A_factory.factorymethod;

import java.util.*;

/**
 * 
 */
public class PaperRectShape implements ShapeProduct {


    @Override
    public void drawColor() {
        System.out.println("蓝色矩形纸片");
    }
}