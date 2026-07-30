package SmartHome;

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
