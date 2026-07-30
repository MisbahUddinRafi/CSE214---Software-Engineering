package SmartHome;

public class SmartSpeaker implements SmartDevice {
    private boolean state;      // ON = true, OFF = false 
    private double power; 

    public SmartSpeaker() {
        this.state = false;     // initially OFF 
        this.power = 5.0; 
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
        return "Speaker: " + (state ? "Playing": "Idle");
    }
    
    @Override
    public Class<?> getDeviceType() {
        return this.getClass(); 
    }
}
