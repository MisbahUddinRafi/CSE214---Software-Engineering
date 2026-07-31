package behavioral_dp_practice.mediator_dp.chat_system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatMediator implements Mediator {
    private Map<String, AbstractUser> users; 
    
    public ChatMediator() {
        this.users = new HashMap<>(); 
    } 

    public boolean registerUser(AbstractUser user) { 
        if (!users.containsKey(user.getUserName())) {
            users.put(user.getUserName(), user); 
            return true; 
        } 
        System.out.println("username " + user.getUserName() + " already exists"); 
        return false; 
    } 

    public void removeUser(String userName) {
        users.remove(userName); 
    }

    @Override
    public void broadcast(AbstractUser sender, String message) { 
        String senderName = sender.getUserName(); 
        if (!users.containsKey(senderName)) {       // unknown sender 
            System.out.println(senderName + " isn't part of the system"); 
            return; 
        } 

        for (AbstractUser user : users.values()) {
            if (user != sender) {
                user.receive(senderName, message);
            } 
        } 
    } 

    @Override
    public void sendGroup(AbstractUser sender, List<String> receiverNames, String message) {
        for (String receiverName : receiverNames) {
            this.sendPrivate(sender, receiverName, message);        // reuse the private message method
        }
        
    }

    @Override
    public void sendPrivate(AbstractUser sender, String receiverName, String message) {
        String senderName = sender.getUserName(); 
        if (!users.containsKey(senderName)) {       // unknown sender 
            System.out.println(senderName + " isn't part of the system"); 
            return; 
        } 

        AbstractUser receiver = users.get(receiverName); 
        if (receiver != null) {  
            if (receiver != sender) {     // no self messaging 
                receiver.receive(senderName, message); 
            } 
        } else {
            System.out.println("user " + receiverName + " not found.");
        }
        
    } 

    
}
