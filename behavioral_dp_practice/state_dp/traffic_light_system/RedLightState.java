package behavioral_dp_practice.state_dp.traffic_light_system;

// better to use Singleton pattern for RedLightState to reuse the same object 


public class RedLightState extends LightState {

    public RedLightState() { 
        this.color = "RED"; 
        this.displayDuration = 5;   // seconds
        this.displayMessage = "Stop Moving"; 
    } 

    @Override 
    public LightState getNextState() {
        return new YellowLightState(); 
    }
    
}
