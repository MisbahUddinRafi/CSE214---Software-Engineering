package SmartHome;

public abstract class SmartDeviceDecorator implements SmartDevice {
    protected SmartDevice wrappedDevice; 

    public SmartDeviceDecorator(SmartDevice wrappedDevice) {
        this.wrappedDevice = wrappedDevice; 
    }

    @Override
    public void activate() {
        wrappedDevice.activate();
    }

    @Override
    public void deactivate() {
        wrappedDevice.deactivate();        
    }

    @Override
    public double getPowerUsage() {
        return wrappedDevice.getPowerUsage();
    }

    @Override
    public String getStatus() {
        return wrappedDevice.getStatus();
    }
    
}
