package builder_dp.house_construction_system;

public abstract class HouseBuilder {
    protected House house; 

    public HouseBuilder() {
        this.reset(); 
    } 

    public void reset() {
        this.house = new House(); 

        // default values: 
        house.setFoundation("default foundation"); 
        house.setWalls("default walls"); 
        house.setRoof("default roof"); 
        house.setDoors("wooden doors"); 
        house.setWindows("wooden windows"); 
        house.setGarage("no garage"); 
        house.setSwimmingPool("no swimming pool");
    } 

    public HouseBuilder buildFoundation(String foundation) {
        house.setFoundation(foundation); 
        return this; 
    } 

    public HouseBuilder buildWalls(String walls) { 
        house.setWalls(walls);
        return this; 
    } 

    public HouseBuilder buildRoof(String roof) {
        house.setRoof(roof); 
        return this; 
    } 

    public HouseBuilder buildWindows(String windows) {
        house.setWindows(windows); 
        return this; 
    } 

    public HouseBuilder buildGarage(String garage) {
        house.setGarage(garage); 
        return this; 
    } 

    public HouseBuilder buildSwimmingPool(String swimmingPool) {
        house.setSwimmingPool(swimmingPool); 
        return this; 
    } 

    // final object 
    public House build() {
        House result = this.house; 
        this.reset(); 
        return result; 
    }

}
