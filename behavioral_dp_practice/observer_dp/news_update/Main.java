package behavioral_dp_practice.observer_dp.news_update;

public class Main { 
    public static void main(String[] args) {
        NewsChannel tsports = new SportsChannel("T-Sports"); 
        NewsChannel bbc = new BusinessChannel("BBC-business"); 
        NewsChannel tech = new TechChannel("Apple News"); 

        Observer rafi = new Viewer("Rafi"); 
        Observer sami = new Viewer("Sami"); 
        Observer kanon = new Viewer("Kanon"); 

        rafi.subscribe(tech); 
        rafi.subscribe(bbc); 
        rafi.subscribe(tsports); 

        sami.subscribe(tsports); 
        sami.subscribe(tech); 
        
        kanon.subscribe(bbc); 
        kanon.subscribe(tech); 
        kanon.subscribe(tsports); 

        tsports.addNews("Bangladesh won by 3 wickets!"); System.out.println();
        bbc.addNews("gold price drops"); System.out.println(); 
        tech.addNews("Apple launches new macbook"); System.out.println(); 

        kanon.unsubscribe(tsports); 

        tsports.addNews("Spain won the fifa world cup"); System.out.println(); 
    }
    
}
