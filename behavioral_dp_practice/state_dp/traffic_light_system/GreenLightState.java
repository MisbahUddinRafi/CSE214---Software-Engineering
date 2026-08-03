package behavioral_dp_practice.state_dp.traffic_light_system;


// better to use Singleton pattern for GreenLightState to reuse the same object 

public class GreenLightState extends LightState { 
    
    public GreenLightState() {
        this.color = "GREEN"; 
        this.displayDuration = 5;   // seconds
        this.displayMessage = "Move"; 
    }
    
    @Override 
    public LightState getNextState() {
        return new RedLightState(); 
    }

}

