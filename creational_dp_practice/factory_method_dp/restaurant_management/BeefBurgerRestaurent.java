package factory_method_dp.restaurant_management;

public class BeefBurgerRestaurent extends Restaurent {
    
    @Override
    Burger createBurger() {
        return new BeefBurger();
    }
}
