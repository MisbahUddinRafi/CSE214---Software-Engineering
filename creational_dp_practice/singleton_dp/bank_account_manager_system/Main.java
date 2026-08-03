package creational_dp_practice.singleton_dp.bank_account_manager_system;

public class Main {
    public static void main(String[] args) {
        
        AccountManager manager = AccountManager.getInstance(); 

        // create some accounts 
        manager.createAccount("A101", "A", 0.0); 
        manager.createAccount("A102", "B", 100.5); 
        manager.createAccount("A103", "C", 200); 
        manager.createAccount("A103", "D", 300); 
        System.out.println();
        
        // deposit some amount 
        manager.deposit("A101", -120); 
        manager.deposit("A105", 120); 
        manager.deposit("A101", 120); 
        System.out.println();

        // withdraw some amount 
        manager.withdraw("A103", -60); 
        manager.withdraw("A105", 60); 
        manager.withdraw("A103", 600); 
        manager.withdraw("A103", 60); 
        System.out.println();

        // transfer some amount 
        manager.transfer("A101", "A102", -50);
        manager.transfer("A101", "A105", 50);
        manager.transfer("A105", "A102", 50); 
        manager.transfer("A101", "A102", 500); 
        manager.transfer("A101", "A102", 50);
        System.out.println();






        manager.showAllAccounts();
         
    }

}
