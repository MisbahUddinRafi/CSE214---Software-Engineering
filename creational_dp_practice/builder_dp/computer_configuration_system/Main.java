package creational_dp_practice.builder_dp.computer_configuration_system;

public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector(); 

        ComputerBuilder gamingPCBuilder = new GamingPCBuilder(); 
        ComputerBuilder officePCBuilder = new OfficePCBuilder();  

        Computer gpc = director.construct(gamingPCBuilder); 
        Computer opc = director.construct(officePCBuilder); 
        Computer dpc = director.construct(new DeveloperPCBuilder()); 

        gpc.showConfiguration(); 
        System.out.println("\n" + "-".repeat(48) + "\n"); 
        opc.showConfiguration(); 
        System.out.println("\n" + "-".repeat(48) + "\n"); 
        dpc.showConfiguration(); 

    }
}
