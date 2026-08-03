package creational_dp_practice.builder_dp.house_construction_system;

public class LuxuryHouseBuilder extends HouseBuilder { 

    public LuxuryHouseBuilder() {
        this.reset();
    }

    @Override 
    public void reset() {
        house = new House(); 

        // default values: 
        house.setFoundation("reinforced concrete"); 
        house.setWalls("marble walls"); 
        house.setRoof("glass roof"); 
        house.setDoors("smart doors"); 
        house.setWindows("bulletproof glass"); 
        house.setGarage("3-car garage"); 
        house.setSwimmingPool("large infinity pool"); 
    } 
}
