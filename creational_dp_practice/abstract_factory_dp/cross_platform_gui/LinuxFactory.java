package abstract_factory_dp.cross_platform_gui;

class LinuxButton implements Button {

    @Override
    public void click() {
        System.out.println("Clicked Linux Button");
    }

    @Override
    public void render() {
        System.out.println("Rendering Linux Button");
    }

}


class LinuxCheckBox implements CheckBox {

    @Override
    public void check() {
        System.out.println("Checked Linux Checkbox");
    }

    @Override
    public void render() {
        System.out.println("Rendering Linux Checkbox");
    }

} 


class LinuxTextField implements TextField {

    @Override
    public void typeText() {
        System.out.println("Typing \"Hello Linux\"");
    }

    @Override
    public void render() {
        System.out.println("Rendering Linux TextField");
    }

}



public class LinuxFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }

    @Override
    public TextField createTextField() {
        return new LinuxTextField();
    }
    
}
