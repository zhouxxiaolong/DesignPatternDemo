package A_factory.factorymethod;

import java.util.*;

/**
 *
 */
public interface Factory {
    public ShapeProduct create(String type);
}