package behavioral_dp_practice.state_dp.traffic_light_system;

public class TrafficLightSystem {
    private LightState lightState; 

    public TrafficLightSystem() {
        this.lightState = new RedLightState(); 

        // alternative implementation ------------
        // LightState red = new RedLightState(); 
        // LightState yellow = new YellowLightState(); 
        // LightState green = new GreenLightState();  
        
        // red.setNextState(yellow); 
        // yellow.setNextState(green); 
        // green.setNextState(red); 

        // this.lightState = red;    // initial state 

    } 

    public void changeState(LightState lightState) {
        this.lightState = lightState; 
    } 

    public void start(int cycle) { 

        for (int i = 0; i < cycle; i++) { 
            // display the current state message
            this.lightState.display(); 

            // simulate time delay 
            try { 
                int durationInSeconds = this.lightState.getDisplayDuration(); 

                for (int j = durationInSeconds; j > 0; j--) { 
                    System.out.print(j + " "); 
                    Thread.sleep(1000);      // miliseconds 
                } 
                System.out.println("\n");

            } catch (InterruptedException e) {
                e.printStackTrace(); 
            } 

            // change state
            this.changeState(lightState.getNextState()); 
        } 

    }
}
