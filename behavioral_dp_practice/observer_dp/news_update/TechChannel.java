package behavioral_dp_practice.observer_dp.news_update;

import java.util.List; 
import java.util.ArrayList; 


public class TechChannel implements NewsChannel { 
    private String channelName; 
    private List<String> news;  
    private List<Observer> viewers;  

    public TechChannel(String channelName) {
        this.channelName = channelName; 
        this.news = new ArrayList<>();
        this.viewers = new ArrayList<>();  
    } 

    public void addNews(String news) {
        this.news.add(news); 
        notifyViewers(); 
    }

    @Override
    public void addViewer(Observer viewer) {
        viewers.add(viewer); 
    }

    @Override
    public void removeViewer(Observer viewer) {
        viewers.remove(viewer);         
    } 

    @Override
    public void notifyViewers() {
        String newsUpdate = news.getLast(); 
        
        for (Observer viewer : viewers) {
            viewer.update(channelName, newsUpdate); 
        }
    }
    
}
