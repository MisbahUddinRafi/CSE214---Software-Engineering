package behavioral_dp_practice.observer_dp.weather_update;

public class PhoneApp implements Observer {

    @Override
    public void update(double temperature) {
        System.out.println("Phone App Temperature \t: " + temperature);
    }
    
}
