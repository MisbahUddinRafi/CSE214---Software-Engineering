package structural_dp_practice.composite_dp.SmartHome;

public class SmartLight implements SmartDevice {
    private boolean state;      // ON = true, OFF = false 
    private double power; 

    public SmartLight() {
        this.state = false; 
        this.power = 10.0; 
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
        return "Light: " + (state ? "ON": "OFF");
    }

    @Override
    public Class<?> getDeviceType() {
        return this.getClass(); 
    }
    
}
