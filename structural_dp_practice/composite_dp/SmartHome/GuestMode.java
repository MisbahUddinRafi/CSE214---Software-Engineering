package structural_dp_practice.composite_dp.SmartHome;

import java.util.Set; 
import java.util.List;

public class GuestMode extends SmartCompositeDecorator {
    private Set<Class<?>> guestAllowed; 
    
    public GuestMode(SmartComposite wrappedDevice, Set<Class<?>> guestAllowed) {
        super(wrappedDevice);
        this.guestAllowed = guestAllowed;
    } 

    @Override 
    public void activate() { 
        List<SmartDevice> devices = wrapped.getDevices();  

        for (SmartDevice d : devices) {
            if (guestAllowed.contains(d.getDeviceType())) {
                d.activate();
            }
        }
    }

    @Override
    public void deactivate() {
        super.deactivate();
    }

    @Override
    public double getPowerUsage() {
        return super.getPowerUsage();
    }

    @Override
    public String getStatus() { 
        StringBuilder sb = new StringBuilder(super.getStatus()); 
        sb.append(" [GUEST MODE]\n");
        
        List<SmartDevice> devices = wrapped.getDevices(); 

        for (SmartDevice d : devices) {
            if (!guestAllowed.contains(d.getDeviceType())) {
                sb.append("\t" + d.getStatus() + " [guest-restricted]\n"); 
            } else {
                sb.append("\t" + d.getStatus() + "\n"); 
            }
        }

        return sb.toString(); 
    } 

    
}
