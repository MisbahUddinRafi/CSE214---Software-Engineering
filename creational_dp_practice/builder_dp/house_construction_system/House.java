package creational_dp_practice.builder_dp.house_construction_system;

public class House {
    private String foundation; 
    private String walls; 
    private String roof; 
    private String doors; 
    private String windows; 
    private String garage; 
    private String swimmingPool; 

    House() {
        // intentionally kept blank 
        // builder will initialize the fields 
    }

    // Getters and Setters ---------------------------- 
    // setter methods are kept package-private 
    public String getFoundation() {
        return foundation;
    }

    void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getWalls() {
        return walls;
    }

    void setWalls(String walls) {
        this.walls = walls;
    }

    public String getRoof() {
        return roof;
    }

    void setRoof(String roof) {
        this.roof = roof;
    }

    public String getDoors() {
        return doors;
    }

    void setDoors(String doors) {
        this.doors = doors;
    }

    public String getWindows() {
        return windows;
    }

    void setWindows(String windows) {
        this.windows = windows;
    }

    public String getGarage() {
        return garage;
    }

    void setGarage(String garage) {
        this.garage = garage;
    }

    public String getSwimmingPool() {
        return swimmingPool;
    }

    void setSwimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
    } 


    public void getHouseDetails() {
        System.out.println("----------- House -----------"); 
        System.out.println("foundation \t: " + foundation); 
        System.out.println("walls \t\t: " + walls); 
        System.out.println("roof \t\t: " + roof); 
        System.out.println("doors \t\t: " + doors); 
        System.out.println("windows \t: " + windows); 
        System.out.println("garage \t\t: " + garage); 
        System.out.println("swimming pool \t: " + swimmingPool); 

    }
    
}
