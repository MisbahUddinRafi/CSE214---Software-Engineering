package SmartHome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List; 

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
    public List<SmartDevice> getDevices() {
        List<SmartDevice> devices = new ArrayList<>();

        for (SmartDevice r : components) {
            devices.addAll(((SmartComposite) r).getDevices());
        }

        return Collections.unmodifiableList(devices);
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
