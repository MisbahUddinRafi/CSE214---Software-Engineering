package behavioral_dp_practice.observer_dp.weather_update;

public class WeatherWebsite implements Observer {
    
    @Override 
    public void update(double temperature) {
        System.out.println("Weather Website Temperature \t: " + temperature);
    }

}
