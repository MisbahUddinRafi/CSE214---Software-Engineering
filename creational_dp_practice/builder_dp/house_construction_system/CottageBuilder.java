package builder_dp.house_construction_system;

public class CottageBuilder extends HouseBuilder {
    
    public CottageBuilder() {
        this.reset(); 
    } 

    @Override 
    public void reset() {
        this.house = new House(); 

        // default values: 
        house.setFoundation("stone foundation"); 
        house.setWalls("wooden walls"); 
        house.setRoof("wooden roof"); 
        house.setDoors("wooden doors"); 
        house.setWindows("small wooden windows"); 
        house.setGarage("no garage"); 
        house.setSwimmingPool("no swimming pool");
    } 
} 
