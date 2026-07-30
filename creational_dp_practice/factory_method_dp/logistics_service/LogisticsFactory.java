package factory_method_dp.logistics_service;

public abstract class LogisticsFactory {
    
    abstract Logistics createLogistics(); 

    public void startDelivery() {
        Logistics logistics = createLogistics(); 
        logistics.transport(); 
        logistics.track(); 
    } 
} 
