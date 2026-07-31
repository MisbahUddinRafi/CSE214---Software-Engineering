package behavioral_dp_practice.mediator_dp.chat_system;

import java.util.List;

public abstract class AbstractUser {
    private String username; 
    private Mediator mediator; 

    public AbstractUser(String username, Mediator mediator) {
        this.username = username;
        this.mediator = mediator; 

        // ensures username is listed in the mediator
        // constructor shouldn't do this 
        // did here for simplicity 
        // better to use factory method for User object creation 
        this.mediator.registerUser(this);        // bad practice 
    } 

    public String getUserName() {
        return this.username; 
    } 

    public void receive(String senderName, String message) {
        System.out.println(senderName + " to " + username + " : " + message); 
    }

    public void sendPrivate(String receiverName, String message) {
        mediator.sendPrivate(this, receiverName, message);
    } 

    public void sendGroup(List<String> receiverNames, String message) {
        mediator.sendGroup(this, receiverNames, message);
    } 

    public void broadcast(String message) {
        mediator.broadcast(this, message);
    }  
    
}
