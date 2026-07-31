package behavioral_dp_practice.observer_dp.news_update;

public interface Observer {
    void subscribe(NewsChannel newsChannel); 
    void unsubscribe(NewsChannel newsChannel); 
    void update(String channelName, String news); 
}
