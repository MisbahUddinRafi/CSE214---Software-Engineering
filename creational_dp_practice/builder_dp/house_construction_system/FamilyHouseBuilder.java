package builder_dp.house_construction_system;

public class FamilyHouseBuilder extends HouseBuilder {
    
    public FamilyHouseBuilder() {
        this.reset(); 
    } 

    @Override 
    public void reset() {
        this.house = new House(); 

        // default values: 
        house.setFoundation("concrete"); 
        house.setWalls("brick walls"); 
        house.setRoof("concrete roof"); 
        house.setDoors("wooden doors"); 
        house.setWindows("double-glazed windows"); 
        house.setGarage("1-car garage"); 
        house.setSwimmingPool("no swimming pool");
    }
}
