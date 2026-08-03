package behavioral_dp_practice.state_dp.traffic_light_system;

// can also add an interface if we want to extend the LightState 
public abstract class LightState {
    protected String color; 
    protected String displayMessage; 
    protected int displayDuration; 
    
    abstract LightState getNextState(); 
    
    public void display() {
        System.out.println("[" + color + "] : " + displayMessage); 
    }

    public int getDisplayDuration() {
        return this.displayDuration; 
    } 

}
