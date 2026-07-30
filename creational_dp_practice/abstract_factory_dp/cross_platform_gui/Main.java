package abstract_factory_dp.cross_platform_gui;

public class Main {
    public static void main(String[] args) {
        GUIFactory osFactory; 

        // windows products 
        osFactory = new WindowsFactory(); 

        Button b1 = osFactory.createButton(); 
        CheckBox c1 = osFactory.createCheckBox(); 
        TextField t1 = osFactory.createTextField(); 

        b1.render(); b1.click(); System.out.println();
        c1.render(); c1.check(); System.out.println();
        t1.render(); t1.typeText(); System.out.println();
        System.out.println("-".repeat(32) + "\n"); 

        // mac products 
        osFactory = new MacFactory(); 

        Button b2 = osFactory.createButton(); 
        CheckBox c2 = osFactory.createCheckBox(); 
        TextField t2 = osFactory.createTextField(); 

        b2.render(); b2.click(); System.out.println();
        c2.render(); c2.check(); System.out.println();
        t2.render(); t2.typeText(); System.out.println();
        System.out.println("-".repeat(32) + "\n"); 


        // linux products 
        osFactory = new LinuxFactory(); 

        Button b3 = osFactory.createButton(); 
        CheckBox c3 = osFactory.createCheckBox(); 
        TextField t3 = osFactory.createTextField(); 

        b3.render(); b3.click(); System.out.println();
        c3.render(); c3.check(); System.out.println();
        t3.render(); t3.typeText(); System.out.println();
        System.out.println(); 

    }
}
