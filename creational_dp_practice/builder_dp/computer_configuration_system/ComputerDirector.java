package builder_dp.computer_configuration_system;


public class ComputerDirector { 

    public Computer construct(ComputerBuilder builder) { 
        builder.buildType(); 
        builder.buildCPU(); 
        builder.buildRAM(); 
        builder.buildStorage(); 
        builder.buildGraphicsCard();
        builder.buildOperatingSystem(); 

        return builder.getResult(); 
    } 

}
