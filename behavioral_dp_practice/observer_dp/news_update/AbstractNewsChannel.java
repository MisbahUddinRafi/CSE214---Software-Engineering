package behavioral_dp_practice.observer_dp.news_update;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractNewsChannel implements NewsChannel {
    private String channelName; 
    private List<String> news;  
    private List<Observer> viewers;  

    public AbstractNewsChannel(String channelName) {
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
        if (!viewers.contains(viewer)) {        // prevent double subscription
            viewers.add(viewer); 
        }
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
