package factory_method_dp.logistics_service;

public class AirLogisticsFactory extends LogisticsFactory {

    @Override
    Logistics createLogistics() {
        return new Aeroplane(); 
    }
    
}
