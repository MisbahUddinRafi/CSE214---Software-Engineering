package creational_dp_practice.singleton_dp.logger_system;

public class Main {
    public static void main(String[] args) {
        Logger auth = Logger.getInstance(); 
        Logger payment = Logger.getInstance(); 
        Logger inventory = Logger.getInstance(); 
        Logger userManagement = Logger.getInstance(); 

        auth.log("authentication done");
        payment.log("payment done"); 
        inventory.log("inventory checked"); 
        userManagement.log("user management log"); 
        
        System.out.println();
        System.out.println("Log count: " + auth.getLogCount()); 
        System.out.println("Log count: " + payment.getLogCount()); 

        System.out.println(); 
        System.out.println("Object comparison: " + (auth == payment)); 
    }
}
