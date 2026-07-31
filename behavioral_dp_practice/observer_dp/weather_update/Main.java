package behavioral_dp_practice.observer_dp.weather_update;


public class Main {
    public static void main(String[] args) {
        Observer phone = new PhoneApp(); 
        Observer watch = new WatchDisplay(); 
        Observer weatherWebsite = new WeatherWebsite(); 

        WeatherStation weatherStation = new WeatherStation(); 
        weatherStation.addObserver(phone); 
        weatherStation.addObserver(watch); 
        weatherStation.addObserver(weatherWebsite); 

        weatherStation.setTemperature(30); System.out.println();
        weatherStation.setTemperature(35); System.out.println();

    }
}
