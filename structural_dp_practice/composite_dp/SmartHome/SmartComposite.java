package SmartHome;

import java.util.Collections;
import java.util.List; 

public abstract class SmartComposite implements SmartDevice {
    protected String name; 
    protected List<SmartDevice> components; 

    public SmartComposite(String name) {
        this.name = name; 
    } 

    // return unmodifiable copy of the device list
    public List<SmartDevice> getDevices() {
        return Collections.unmodifiableList(components); 
    } 

    public boolean deactivateLastActiveDevice() {
        for (SmartDevice d : components.reversed()) {
            if (d.getPowerUsage() > 0.0) {
                d.deactivate(); 
                return true; 
            }
        }
        return false; 
    }

    @Override
    public void activate() {
        for (SmartDevice d : components) {
            d.activate();
        }
        
    }
    
    @Override
    public void deactivate() {
        for (SmartDevice d : components) {
            d.deactivate();
        }
        
    }
    
    @Override
    public double getPowerUsage() {
        double power = 0.0; 
        for (SmartDevice d : components) {
            power += d.getPowerUsage(); 
        }
        return power;
    }
}
