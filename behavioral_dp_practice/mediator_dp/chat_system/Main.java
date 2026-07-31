package behavioral_dp_practice.mediator_dp.chat_system;

import java.util.List; 

public class Main {
    public static void main(String[] args) { 
        Mediator chat = new ChatMediator(); 

        User rafi = new User("Rafi", chat); 
        User sami = new User("Sami", chat); 
        User kanon = new User("Kanon", chat); 
        User barson = new User("Barson", chat);  
        User mohtasim = new User("Mohtasim", chat); 

        chat.registerUser(rafi);    // user already exists

        // private message
        rafi.sendPrivate("Sami", "Nasta korte kokhon jaba?"); 
        System.out.println(); 

        // broadcast
        rafi.broadcast("Bari kokhon jabi?"); 
        System.out.println();
        
        // group message
        rafi.sendGroup(List.of("Sami", "Kanon"), "next week e ki ki CT ache?"); 
        System.out.println(); 
        
        // private message
        mohtasim.sendPrivate("Rafi", "ami toh ajkei jacchi re."); 
        System.out.println(); 

        // remove user
        chat.removeUser("Mohtasim"); 
        
        // try to send messages from unknown user 
        mohtasim.broadcast("am I in?"); 

        // try to communicate with deleted member 
        sami.sendPrivate("Mohtasim", "class kemon chole?"); 
        System.out.println(); 
        
        // broadcast after removing one user 
        sami.broadcast("kabab khaite jabi?"); 
        System.out.println(); 

        
    }
}
