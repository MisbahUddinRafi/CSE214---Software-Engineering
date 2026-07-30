package SmartHome;

public class AccessRestricted extends SmartDeviceDecorator {
    private final int pin; 
    private boolean locked; 

    public AccessRestricted(SmartDevice wrappedDevice, int pin) {
        super(wrappedDevice); 
        this.pin = pin; 
        this.locked = true; 
    } 

    public void lock(int pin) {
        if (this.pin == pin) {
            this.locked = true; 
        }
    }

    public void unlock(int pin) {
        if (this.pin == pin) {
            this.locked = false; 
        }
    }

    @Override
    public void activate() {
        if (!locked) {
            super.activate(); 
        }
    }

    @Override
    public void deactivate() {
        if (!locked) {
            super.deactivate(); 
        }
    }

    @Override
    public double getPowerUsage() { 
        return super.getPowerUsage();
    }

    @Override
    public String getStatus() { 
        StringBuilder sb = new StringBuilder(super.getStatus()); 
        if (locked) {
            sb.append(" [LOCKED]"); 
        }
        return sb.toString();
    }

    @Override
    public Class<?> getDeviceType() {
        return wrappedDevice.getDeviceType(); 
    }
    
}
