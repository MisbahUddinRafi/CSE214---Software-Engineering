package creational_dp_practice.builder_dp.computer_configuration_system;

public abstract class ComputerBuilder { 
    protected Computer computer; 

    // default implemntations ---------------------------------
    public ComputerBuilder() { 
        this.reset(); 
    }

    public void reset() {
        this.computer = new Computer(); 
    }

    public void buildType() {
        computer.setType("default");
    }

    public void buildCPU() {
        computer.setCpu("default cpu");
    } 

    public void buildRAM() {
        computer.setRam("8 GB");
    } 

    public void buildStorage() {
        computer.setStorage("256 GB SSD");
    }

    public void buildGraphicsCard() {
        computer.setGraphicsCard("integrated graphics");
    } 

    public void buildOperatingSystem() {
        computer.setOperatingSystem("Linux");
    }  

    // final object 
    public final Computer getResult() { 
        Computer product = this.computer; 
        this.reset();       // reset ensures one object can be used only once
        return product; 
    } 
}
