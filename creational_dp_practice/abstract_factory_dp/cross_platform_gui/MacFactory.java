package abstract_factory_dp.cross_platform_gui;

class MacButton implements Button {

    @Override
    public void click() {
        System.out.println("Clicked Mac Button");
    }

    @Override
    public void render() {
        System.out.println("Rendering Mac Button");
    }

}


class MacCheckBox implements CheckBox {

    @Override
    public void check() {
        System.out.println("Checked Mac Checkbox");
    }

    @Override
    public void render() {
        System.out.println("Rendering Mac Checkbox");
    }

} 


class MacTextField implements TextField {

    @Override
    public void typeText() {
        System.out.println("Typing \"Hello Mac\"");
    }

    @Override
    public void render() {
        System.out.println("Rendering Mac TextField");
    }

}



public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

    @Override
    public TextField createTextField() {
        return new MacTextField();
    }
    
}
