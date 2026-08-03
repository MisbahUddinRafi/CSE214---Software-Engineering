package structural_dp_practice.composite_dp.SmartHome;

public class TimerControlled extends SmartDeviceDecorator {
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
