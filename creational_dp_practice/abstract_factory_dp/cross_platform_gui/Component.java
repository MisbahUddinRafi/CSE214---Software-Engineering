package creational_dp_practice.abstract_factory_dp.cross_platform_gui;

public interface Component {
    void render(); 
}


interface Button extends Component {
    void click(); 
}


interface CheckBox extends Component {
    void check(); 
}


interface TextField extends Component {
    void typeText();  
}