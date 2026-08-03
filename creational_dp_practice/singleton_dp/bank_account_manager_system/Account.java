package creational_dp_practice.singleton_dp.bank_account_manager_system;


public class Account {
    private String accountNumber; 
    private String holderName; 
    private double balance;

    public Account(String accountNumber, String holderName, double initialBalance) { 
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance; 
    } 

    public String getHolderName() {
        return holderName; 
    } 

    public double getBalance() {
        return balance; 
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false; 
        } 

        balance += amount; 
        return true; 
    } 

    public boolean withdraw(double amount) {
        if (amount > balance || amount <= 0) {
            return false; 
        }

        balance -= amount; 
        return true; 
    } 

    public void showAccount() {
        System.out.println("Account Number \t: " + accountNumber); 
        System.out.println("Holder Name \t: " + holderName); 
        System.out.println("Balance \t: " + balance); 
    } 

}
