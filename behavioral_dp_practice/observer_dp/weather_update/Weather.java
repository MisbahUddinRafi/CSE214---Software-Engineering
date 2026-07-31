package behavioral_dp_practice.observer_dp.weather_update;

// this is the subject
public interface Weather {
    void addObserver(Observer observer); 
    void removeObserver(Observer observer);  
    void notifyObservers(); 
}
