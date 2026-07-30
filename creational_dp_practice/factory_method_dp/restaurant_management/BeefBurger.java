package factory_method_dp.restaurant_management;

public class BeefBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Prepared Beef Burger");
    }
    
}
