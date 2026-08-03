package structural_dp_practice.composite_dp.SmartHome;

import java.util.ArrayList;

public class Room extends SmartComposite {

    public Room(String name) {
        super(name); 
        this.components = new ArrayList<>(); 
    }

    public void addDevice(SmartDevice device) {
        components.add(device); 
    } 

    public void removeDevice(SmartDevice device) {
        components.remove(device); 
    }
    
    // useful for eco mode 
    public boolean deactivateLastActiveDevice() { 
        for (SmartDevice sd : components.reversed()) {
            if(sd.getPowerUsage() > 0) {
                sd.deactivate();
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

    @Override
    public String getStatus() {
        StringBuilder sb = new StringBuilder("[" + name + "]"); 

        for (SmartDevice d : components) {
            sb.append("\n\t").append(d.getStatus()); 
        }

        return sb.toString(); 
    }

    @Override
    public Class<?> getDeviceType() {
        return this.getClass(); 
    }
    
}
