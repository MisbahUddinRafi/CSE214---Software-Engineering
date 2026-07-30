package builder_dp.computer_configuration_system;

public class Computer {
    private String type; 
    private String cpu; 
    private String ram; 
    private String storage; 
    private String graphicsCard; 
    private String operatingSystem; 
    
    // pacage-private constructor ------------------------------------
    Computer() {
        // kept empty intentionally 
        // builder will do the job 
    }

    //  package-private setter methods ------------------------------- 
    void setType(String type) {
        this.type = type; 
    }

    void setCpu(String cpu) {
        this.cpu = cpu;
    }

    void setRam(String ram) {
        this.ram = ram;
    }

    void setStorage(String storage) {
        this.storage = storage;
    }

    void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }


    //  public getter methods ------------------------------- 
    public String getType() {
        return type; 
    } 

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    } 


    public void showConfiguration() {
        System.out.println("----- " + this.type + " Computer Configuration " + "-----"); 
        System.out.println("CPU: \t\t\t" + cpu); 
        System.out.println("RAM: \t\t\t" + ram);  
        System.out.println("Storage: \t\t" + storage);  
        System.out.println("Graphics Card: \t\t" + graphicsCard);  
        System.out.println("Operating System: \t" + operatingSystem);   
    }
    
}
