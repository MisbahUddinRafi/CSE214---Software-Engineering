package creational_dp_practice.factory_method_dp.restaurant_management;

public class VegiBurgerRestaurent extends Restaurent {

    @Override
    Burger createBurger() {
        return new VegiBurger();
    }
    
}
