package behavioral_dp_practice.observer_dp.weather_update;

import java.util.List; 
import java.util.ArrayList; 

public class WeatherStation implements Weather { 
    private double temperature; 
    private List<Observer> observers; 

    public WeatherStation() {
        observers = new ArrayList<>(); 
    } 

    public void setTemperature(double temperature) {
        this.temperature = temperature; 
        notifyObservers(); 
    } 

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer); 
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);         
    } 

    @Override
    public void notifyObservers() { 
        for (Observer observer : observers) {
            observer.update(temperature); 
        }
    }
    
}
