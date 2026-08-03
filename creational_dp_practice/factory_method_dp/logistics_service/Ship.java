package creational_dp_practice.factory_method_dp.logistics_service;

public class Ship implements SeaLogistics {

    @Override
    public void sail() {
        System.out.println("Sailing ship");
    }

    @Override
    public void track() {
        System.out.println("Ship tracking");        
    }

    @Override
    public void transport() {
        System.out.println("Ship Transport");        
    }
    
}
