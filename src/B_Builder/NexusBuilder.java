package B_Builder;

/**
 *
 */
public class NexusBuilder implements Builder {

    private Phone phone = new Phone();

    public NexusBuilder() {
    }

    @Override
    public void name() {
        phone.setName("Nexus 5x");
    }

    @Override
    public void buildCPU() {
        phone.setCpu("Nexus CPU");
    }

    @Override
    public void buildRAM() {
        phone.setRam("3G");
    }

    @Override
    public void buildScreen() {
        phone.setScreen("Nexus Screen");
    }

    @Override
    public void buildMainBoard() {
        phone.setMainBoard("Nexus MainBoard");
    }

    @Override
    public Phone create() {
        return phone;
    }

}