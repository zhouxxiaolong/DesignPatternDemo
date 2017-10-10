package B_Builder;

/**
 *
 */
public class IPhoneBuilder implements Builder {

    private Phone phone = new Phone();

    public IPhoneBuilder() {
    }

    @Override
    public void name() {
        phone.setName("iPhone 8");
    }

    @Override
    public void buildCPU() {
        phone.setCpu("A11");
    }

    @Override
    public void buildRAM() {
        phone.setRam("4G");
    }

    @Override
    public void buildScreen() {
        phone.setScreen("Apple Screen");
    }

    @Override
    public void buildMainBoard() {
        phone.setMainBoard("Apple MainBoard");
    }

    @Override
    public Phone create() {
        return phone;
    }

}