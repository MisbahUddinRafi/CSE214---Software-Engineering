package builder_dp.computer_configuration_system;

public class DeveloperPCBuilder extends ComputerBuilder { 

    @Override
    public void buildType() {
        computer.setType("Developer");
    }

    @Override
    public void buildCPU() {
        computer.setCpu("AMD Ryzen 9");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("NVIDIA RTX 4070");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Ubuntu Linux"); 
    } 

    @Override
    public void buildRAM() {
        computer.setRam("64 GB"); 
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1 TB SSD");
    }
    
}
