package behavioral_dp_practice.observer_dp.news_update;

import java.util.ArrayList;
import java.util.List;


public class Viewer implements Observer {
    private String viewerName; 
    private List<NewsChannel> subscribedChannels; 

    public Viewer(String viewerName) {
        this.viewerName = viewerName; 
        this.subscribedChannels = new ArrayList<>(); 
    } 

    @Override
    public void subscribe(NewsChannel newsChannel) { 
        if (!subscribedChannels.contains(newsChannel)) {    // prevent double subscription
            newsChannel.addViewer(this); 
            this.subscribedChannels.add(newsChannel);       
        }  
    } 

    @Override
    public void unsubscribe(NewsChannel newsChannel) { 
        newsChannel.removeViewer(this); 
        this.subscribedChannels.remove(newsChannel); 
    }

    @Override
    public void update(String channelName, String news) {
        System.out.println("update for " + viewerName + ", from channel: " + channelName + ", news update: " + news); 
    }
    
}
