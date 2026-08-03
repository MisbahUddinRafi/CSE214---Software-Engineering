package behavioral_dp_practice.strategy_dp.payment_system;

public class Bkash implements PaymentMethod {
    private String username; 
    private String phoneNumber; 
    private final double fee = 15; 
    private final double cashbackEligiblePrice = 5000; 
    private final double cashbackAmount = 100; 

    public Bkash(String username, String phoneNumber) {
        this.username = username; 
        this.phoneNumber = phoneNumber; 
    }

    public String getUsername() {
        return username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getFee() {
        return fee;
    }

    public double getCashbackEligiblePrice() {
        return cashbackEligiblePrice;
    }

    public double getCashbackAmount() {
        return cashbackAmount;
    }


    private boolean isCashbackApplicable(double amount) {
        return amount >= cashbackEligiblePrice; 
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            return false; 
        } 

        double finalAmount = amount + fee; 
        
        if (isCashbackApplicable(amount)) {
            finalAmount -= cashbackAmount; 
        } 

        System.out.println("bKash Payment of amount " + finalAmount + " successful."); 
        if (isCashbackApplicable(amount)) System.out.println("cashback amount: " + cashbackAmount);   
        
        return true;
    }

    
}
