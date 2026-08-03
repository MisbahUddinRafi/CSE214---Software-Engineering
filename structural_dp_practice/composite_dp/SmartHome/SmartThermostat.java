package structural_dp_practice.composite_dp.SmartHome;

public class SmartThermostat implements SmartDevice {
    private boolean state;      // ON = true, OFF = false 
    private double power; 

    public SmartThermostat() {
        this.state = false;     // initially OFF  
        this.power = 150.0; 
    }

    @Override
    public void activate() {
        state = true; 
    }

    @Override
    public void deactivate() {
        state = false;         
    }

    @Override
    public double getPowerUsage() {
        return state ? this.power : 0.0; 
    }

    @Override
    public String getStatus() {
        return "Thermostat: " + (state ? "ON": "OFF");
    }

    @Override
    public Class<?> getDeviceType() {
        return this.getClass(); 
    }
}
