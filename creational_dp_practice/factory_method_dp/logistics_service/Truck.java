package creational_dp_practice.factory_method_dp.logistics_service;

public class Truck implements GroundLogistics {

    @Override
    public void transport() {
        System.out.println("Truck Transport");         
    }

    @Override
    public void track() {
        System.out.println("Truck tracking");         
    } 

    @Override 
    public void drive() {
        System.out.println("Driving truck");
    }
    
}
