package SmartHome;

import java.util.ArrayList;

public class Home extends SmartComposite {  

    public Home(String name) {
        super(name); 
        this.components = new ArrayList<>(); 
    }

    public void addRoom(SmartDevice room) {
        components.add(room); 
    }

    public void removeRoom(SmartDevice room) {
        components.remove(room); 
    }

    // useful for eco mode 
    public boolean deactivateLastActiveDevice() { 
        for (SmartDevice r : components.reversed()) {
            if(r.getPowerUsage() > 0) { 
                ((SmartComposite) r).deactivateLastActiveDevice(); 
                return true; 
            }
        }
        return false; 
    } 


    @Override
    public void activate() {
        for (SmartDevice r : components) {
            r.activate(); 
        }  
    }

    @Override
    public void deactivate() {
        for (SmartDevice r : components) {
            r.deactivate(); 
        }  
    }

    @Override
    public double getPowerUsage() {
        double power = 0.0; 
        for (SmartDevice r : components) {
            power += r.getPowerUsage(); 
        }
        return power;
    }

    @Override
    public String getStatus() {
        StringBuilder sb = new StringBuilder("=== " + name + " ==="); 

        for (SmartDevice r : components) {
            sb.append("\n").append(r.getStatus()); 
        }

        return sb.toString(); 
    }

    @Override
    public Class<?> getDeviceType() {
        return this.getClass(); 
    }
    
}
