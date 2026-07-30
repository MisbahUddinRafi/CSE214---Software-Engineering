package factory_method_dp.logistics_service;

public class Aeroplane implements AirLogistics {

    @Override
    public void transport() {
        System.out.println("Aeroplane Transport");         
    } 

    @Override
    public void track() {
        System.out.println("Aeroplane tracking");         
    } 

    @Override 
    public void fly() {
        System.out.println("Flying aeroplane");
    }
    
}
