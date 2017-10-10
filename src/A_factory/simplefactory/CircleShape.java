package A_factory.simplefactory;

/**
 *
 */
public class CircleShape implements ShapeProduct {

    public CircleShape() {
    }

    @Override
    public void drawColor() {
        System.out.println("红色圆形纸片");
    }

}