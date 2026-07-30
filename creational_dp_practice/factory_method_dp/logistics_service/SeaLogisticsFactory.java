package factory_method_dp.logistics_service;

public class SeaLogisticsFactory extends LogisticsFactory {

    @Override
    Logistics createLogistics() {
        return new Ship();
    }
    
}
