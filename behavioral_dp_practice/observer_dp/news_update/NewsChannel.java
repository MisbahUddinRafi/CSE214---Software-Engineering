package behavioral_dp_practice.observer_dp.news_update;

public interface NewsChannel {
    void addViewer(Observer viewer); 
    void removeViewer(Observer viewer); 
    void notifyViewers(); 
    void addNews(String news); 
}
