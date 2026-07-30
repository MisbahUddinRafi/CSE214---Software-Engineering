package SmartHome;

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
        StringBuilder sb = new StringBuilder("[GUEST MODE]\n");
        sb.append("[").append(wrapped.name).append("]"); 

        for (SmartDevice d : wrapped.getDevices()) {
            sb.append("\n\t").append(d.getStatus());

            if (!guestAllowed.contains(d.getDeviceType())) {
                sb.append(" [guest-restricted]");
            }
        }

        return sb.toString();
    }

    
}
