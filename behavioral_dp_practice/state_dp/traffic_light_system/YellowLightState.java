package behavioral_dp_practice.state_dp.traffic_light_system;


// better to use Singleton pattern for YellowLightState to reuse the same object 


public class YellowLightState extends LightState {

    public YellowLightState() {
        this.color = "YELLOW"; 
        this.displayDuration = 3;   // seconds
        this.displayMessage = "Wait"; 
    } 

    @Override 
    public LightState getNextState() {
        return new GreenLightState(); 
    }

}
