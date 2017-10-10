package B_Builder;

/**
 * 
 */
public interface Builder {

    public void name();

    public void buildCPU();

    public void buildRAM();

    public void buildScreen();

    public void buildMainBoard();
    
    public Phone create();

}