package behavioral_dp_practice.observer_dp.weather_update;

public class WatchDisplay implements Observer {

    @Override
    public void update(double temperature) {
        System.out.println("Watch Display Temperature \t: " + temperature);
    }
    
}
