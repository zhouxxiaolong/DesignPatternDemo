package B_Builder;

import java.util.*;

/**
 *
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 可以在客户端处分别赋值
     */
    public void construct() {
        builder.name();
        builder.buildCPU();
        builder.buildRAM();
        builder.buildMainBoard();
        builder.buildScreen();
    }

}