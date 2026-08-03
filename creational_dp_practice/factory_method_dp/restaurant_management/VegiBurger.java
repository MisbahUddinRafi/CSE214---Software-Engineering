package creational_dp_practice.factory_method_dp.restaurant_management;

public class VegiBurger implements Burger {
    
    @Override 
    public void prepare() {
        System.out.println("Prepared Vegi Burger");
    }
}
