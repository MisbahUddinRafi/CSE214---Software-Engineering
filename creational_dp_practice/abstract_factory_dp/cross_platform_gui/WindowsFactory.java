package abstract_factory_dp.cross_platform_gui;

class WindowsButton implements Button {

    @Override
    public void click() {
        System.out.println("Clicked Windows Button");
    }

    @Override
    public void render() {
        System.out.println("Rendering Windows Button");
    }

}


class WindowsCheckBox implements CheckBox {

    @Override
    public void check() {
        System.out.println("Checked Windows Checkbox");
    }

    @Override
    public void render() {
        System.out.println("Rendering Windows Checkbox");
    }

} 


class WindowsTextField implements TextField {

    @Override
    public void typeText() {
        System.out.println("Typing \"Hello Windows\"");
    }

    @Override
    public void render() {
        System.out.println("Rendering Windows TextField");
    }

}



public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
    
}
