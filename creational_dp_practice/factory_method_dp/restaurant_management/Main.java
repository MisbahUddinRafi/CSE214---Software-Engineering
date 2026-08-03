package creational_dp_practice.factory_method_dp.restaurant_management;

public class Main {
    public static void main(String[] args) {
        Restaurent r = new BeefBurgerRestaurent(); 
        r.processBurger(); 

        r = new VegiBurgerRestaurent(); 
        Burger b2 = r.createBurger(); 
        b2.prepare(); 
    }
}
