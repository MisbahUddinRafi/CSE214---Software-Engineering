package creational_dp_practice.builder_dp.computer_configuration_system;

public class GamingPCBuilder extends ComputerBuilder {

    @Override
    public void buildType() {
        computer.setType("Gaming");
    }

    public void buildCPU() {
        computer.setCpu("Intel Core i9");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("NVIDIA RTX 5090");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 11 Pro"); 
    } 

    @Override
    public void buildRAM() {
        computer.setRam("32 GB"); 
    }

    @Override
    public void buildStorage() {
        computer.setStorage("2 TB SSD");
    }
    
}
