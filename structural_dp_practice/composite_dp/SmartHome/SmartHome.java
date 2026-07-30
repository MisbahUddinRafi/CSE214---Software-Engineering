package SmartHome;

import java.util.*; 

interface SmartDevice {
    void activate(); 
    void deactivate(); 
    double getPowerUsage(); 
    String getStatus(); 
    Class<?> getDeviceType(); 
}


abstract class SmartComposite implements SmartDevice {
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



// ========================================== 
//              Devices
// ==========================================

class SmartLight implements SmartDevice {
    private boolean state;      // ON = true, OFF = false 
    private double power; 

    public SmartLight() {
        this.state = false; 
        this.power = 10.0; 
    }

    @Override
    public void activate() {
        state = true; 
    }

    @Override
    public void deactivate() {
        state = false;         
    }

    @Override
    public double getPowerUsage() {
        return state ? this.power : 0.0; 
    }

    @Override
    public String getStatus() { 
        return "Light: " + (state ? "ON": "OFF");
    }

    @Override
    public Class<?> getDeviceType() {
        return this.getClass(); 
    }
    
} 


class SmartSpeaker implements SmartDevice {
    private boolean state;      // ON = true, OFF = false 
    private double power; 

    public SmartSpeaker() {
        this.state = false;     // initially OFF 
        this.power = 5.0; 
    }

    @Override
    public void activate() {
        state = true; 
    }

    @Override
    public void deactivate() {
        state = false;         
    }

    @Override
    public double getPowerUsage() {
        return state ? this.power : 0.0; 
    }

    @Override
    public String getStatus() {
        return "Speaker: " + (state ? "Playing": "Idle");
    }
    
    @Override
    public Class<?> getDeviceType() {
        return this.getClass(); 
    }
} 



class SmartThermostat implements SmartDevice {
    private boolean state;      // ON = true, OFF = false 
    private double power; 

    public SmartThermostat() {
        this.state = false;     // initially OFF  
        this.power = 150.0; 
    }

    @Override
    public void activate() {
        state = true; 
    }

    @Override
    public void deactivate() {
        state = false;         
    }

    @Override
    public double getPowerUsage() {
        return state ? this.power : 0.0; 
    }

    @Override
    public String getStatus() {
        return "Thermostat: " + (state ? "ON": "OFF");
    }

    @Override
    public Class<?> getDeviceType() {
        return this.getClass(); 
    }
}
 



// ========================================== 
//      Composite devices Room and Home
// ============================================

class Room extends SmartComposite {

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



class Home extends SmartComposite {  

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



// ================================== 
//       Decorators 
// ==================================== 

abstract class SmartDeviceDecorator implements SmartDevice {
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




abstract class SmartCompositeDecorator implements SmartDevice {
    protected SmartComposite wrapped; 

    public SmartCompositeDecorator(SmartComposite wrapped) {
        this.wrapped = wrapped; 
    }

    @Override
    public void activate() {
        wrapped.activate();
    }

    @Override
    public void deactivate() {
        wrapped.deactivate();        
    }

    @Override
    public double getPowerUsage() {
        return wrapped.getPowerUsage();
    }

    @Override
    public String getStatus() {
        return wrapped.getStatus();
    }

    @Override
    public Class<?> getDeviceType() {
        return wrapped.getDeviceType(); 
    }
}


// =========================================== 
// device level upgrades 
// ==========================================

class AccessRestricted extends SmartDeviceDecorator {
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



class PowerThrottled extends SmartDeviceDecorator { 
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





class TimerControlled extends SmartDeviceDecorator {
    private int timerSeconds; 
    private boolean timerRunning; 

    public TimerControlled(SmartDevice wrappedDevice, int timerSeconds) {
        super(wrappedDevice); 
        this.timerSeconds = timerSeconds; 
        this.timerRunning = false; 
    }

    public void simulateTimerExpiry() { 
        if (timerRunning) {
            this.deactivate(); 
        }
    }

    @Override
    public void activate() {
        super.activate(); 
        this.timerRunning = true; 
    }

    @Override
    public void deactivate() {
        super.deactivate(); 
        this.timerRunning = false; 
    }

    @Override
    public double getPowerUsage() {
        return super.getPowerUsage();
    }

    @Override
    public String getStatus() { 
        StringBuilder sb = new StringBuilder(super.getStatus()); 
        if (timerRunning) {
            sb.append(" (auto-off in " + timerSeconds + "s)");  
        }
        return sb.toString();
    }
    
    @Override
    public Class<?> getDeviceType() {
        return wrappedDevice.getDeviceType(); 
    }
}


// =============================== 
//            Room and Home level upgrades 
// ============================== 

class EcoMode extends SmartCompositeDecorator {
    private double ecoBudget; 

    public EcoMode(SmartComposite wrapped, double ecoBudget) {
        super(wrapped);
        this.ecoBudget = ecoBudget; 
    }

    // private helper method for maintaining eco mode 
    private void maintainEcoBudget() {
        while (super.getPowerUsage() > this.ecoBudget) { 
            if (wrapped.deactivateLastActiveDevice() == false) {
                break; 
            }
        }
    }

    @Override
    public void activate() {
        super.activate(); 
        this.maintainEcoBudget();   // deactivate latest devices 
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
        sb.append("[ECO: " + ecoBudget + "W budget]\n"); 
        return sb.toString(); 
    } 

    
}




class GuestMode extends SmartCompositeDecorator {
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




public class SmartHome {
    
}
