package SmartHome;

public class PowerThrottled extends SmartDeviceDecorator { 
    private double powerCap; 

    public PowerThrottled(SmartDevice wrappedDevice, double powerCap) {
        super(wrappedDevice);
        this.powerCap = powerCap; 
    }
    
    @Override
    public void activate() {
        super.activate();
    }

    @Override
    public void deactivate() {
        super.deactivate();
    }
    
    @Override
    public double getPowerUsage() { 
        double p = super.getPowerUsage(); 
        if (p > this.powerCap) p = this.powerCap; 
        return p; 
    }
    
    @Override
    public String getStatus() { 
        StringBuilder sb = new StringBuilder(super.getStatus()); 
        if (super.getPowerUsage() > this.powerCap) {
            sb.append(" [throttled to " + this.powerCap + "W]"); 
        }
        return sb.toString();
    } 

    @Override
    public Class<?> getDeviceType() {
        return wrappedDevice.getDeviceType(); 
    }
    
}
