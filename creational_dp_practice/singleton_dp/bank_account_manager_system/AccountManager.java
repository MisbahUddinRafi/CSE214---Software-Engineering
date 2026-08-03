package creational_dp_practice.singleton_dp.bank_account_manager_system;

import creational_dp_practice.singleton_dp.logger_system.Logger; 
import java.util.Map; 
import java.util.HashMap; 

public class AccountManager {
    private static AccountManager accountManager; 
    private Map<String, Account> accounts;      // (accountNumber, Account) pairs 
    private Logger logger; 

    private AccountManager() {
        this.accounts = new HashMap<>(); 
        logger = Logger.getInstance(); 
    } 

    public static AccountManager getInstance() {
        if (accountManager == null) {
            accountManager = new AccountManager(); 
        } 

        return accountManager; 
    }  


    private boolean accountExists(String accountNumber) {
        return accounts.containsKey(accountNumber);  
    } 

    private boolean validateAmount(double amount) {
        return amount >= 0;  
    } 

    public Account searchAccount(String accountNumber) {
        return accounts.get(accountNumber); 
    } 

    public void createAccount(String accountNumber, String holderName, double initialBalance) {
        if (!validateAmount(initialBalance)) { 
            System.out.println("amount can't be negative"); 
            logger.log("account creation failed"); 
            return; 
        } 

        if (accountExists(accountNumber)) {
            System.out.println("account with account number " + accountNumber + " already exists"); 
            logger.log("account creation failed"); 
            return; 
        } 

        accounts.put(accountNumber, new Account(accountNumber, holderName, initialBalance)); 
        logger.log("Account created successfully for " + accountNumber);    // logger
    } 

    public void deposit(String accountNumber, double amount) { 
        Account acc = searchAccount(accountNumber);  
        if (acc == null) {
            System.out.println("account " + accountNumber + " doesn't exist."); 
            return; 
        } 

        if (!validateAmount(amount)) {
            return; 
        }

        boolean success = acc.deposit(amount);  
        if (success) {
            logger.log("deposit successful: amount = " + amount + " account = " + accountNumber);   // logger
        } else {
            logger.log("deposite failed: amount = " + amount + " to account = " + accountNumber);     // logger
        } 
    } 

    public void withdraw(String accountNumber, double amount) {
        Account acc = searchAccount(accountNumber);  
        if (acc == null) {
            System.out.println("account " + accountNumber + " doesn't exist."); 
            return; 
        }

        if (!validateAmount(amount)) {
            return; 
        } 

        boolean success = acc.withdraw(amount);  
        if (success) {
            logger.log("withdraw successful: amount = " + amount + " account = " + accountNumber);   // logger
        } else {
            logger.log("withdraw failed: amount = " + amount + "  account = " + accountNumber);     // logger
        } 
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) { 
        Account from = accounts.get(fromAccountNumber); 
        Account to = accounts.get(toAccountNumber); 

        if (from == null) {
            System.out.println("account " + fromAccountNumber + " doesn't exist."); 
            return; 
        }

        if (to == null) {
            System.out.println("account " + toAccountNumber + " doesn't exist."); 
            return; 
        }

        if (from == to) {
            System.out.println("transfer between same account not possible"); 
            return; 
        }

        if (!validateAmount(amount)) {
            return; 
        } 

        if (!from.withdraw(amount)) { 
            logger.log("transfer failed: amount " + amount + " from " + fromAccountNumber + " to " + toAccountNumber);       // logger 
            return; 
        } 
        
        to.deposit(amount); 

        logger.log("transfer successful: amount " + amount + " from " + fromAccountNumber + " to " + toAccountNumber + " is successful.");      // logger
            
    }

    public void showAllAccounts() {
        System.out.println("\nAll Accounts: " + "-".repeat(16)); 

        for (Account account : accounts.values()) {
            account.showAccount(); 
            System.out.println(); 
        }
    }
}
