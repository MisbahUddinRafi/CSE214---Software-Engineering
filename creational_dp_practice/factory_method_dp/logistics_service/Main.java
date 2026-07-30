package factory_method_dp.logistics_service;

public class Main { 
    public static void main(String[] args) {
        LogisticsFactory lf; 

        lf = new SeaLogisticsFactory(); 
        
        Logistics l1 = lf.createLogistics(); 
        l1.transport(); 
        l1.track(); 
        ((SeaLogistics)l1).sail(); 
    }
} 
 