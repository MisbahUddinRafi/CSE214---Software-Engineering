package behavioral_dp_practice.mediator_dp.chat_system;

import java.util.List;

public interface Mediator { 
    boolean registerUser(AbstractUser user); 
    void removeUser(String userName); 
    void sendPrivate(AbstractUser sender, String receiverName, String message); 
    void sendGroup(AbstractUser sender, List<String> receiverNames, String message); 
    void broadcast(AbstractUser sender, String message); 

}
