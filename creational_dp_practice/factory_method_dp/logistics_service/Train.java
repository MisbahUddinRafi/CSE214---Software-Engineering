package factory_method_dp.logistics_service;

public class Train implements GroundLogistics {

    @Override
    public void transport() {
        System.out.println("Train Transport");        
    }

    @Override
    public void track() {
        System.out.println("Train tracking");         
    } 

    @Override 
    public void drive() {
        System.out.println("Driving Train");
    }
    
}
