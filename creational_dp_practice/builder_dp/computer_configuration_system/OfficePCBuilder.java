package builder_dp.computer_configuration_system;

public class OfficePCBuilder extends ComputerBuilder { 

    @Override
    public void buildType() {
        computer.setType("Office");
    }

    
    public void buildCPU() {
        computer.setCpu("Intel Core i5");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("integrated graphics");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 11 Home"); 
    } 

    @Override
    public void buildRAM() {
        computer.setRam("16 GB"); 
    }

    @Override
    public void buildStorage() {
        computer.setStorage("512 GB SSD");
    }
    
}
