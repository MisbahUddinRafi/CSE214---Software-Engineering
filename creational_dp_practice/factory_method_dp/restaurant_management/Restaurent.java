package factory_method_dp.restaurant_management;

public abstract class Restaurent {
    
    abstract Burger createBurger(); 

    public void processBurger() {
        Burger burger = createBurger(); 
        burger.prepare(); 
    }
}
