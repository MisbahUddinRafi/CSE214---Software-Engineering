package creational_dp_practice.factory_method_dp.logistics_service;

public class SeaLogisticsFactory extends LogisticsFactory {

    @Override
    Logistics createLogistics() {
        return new Ship();
    }
    
}
