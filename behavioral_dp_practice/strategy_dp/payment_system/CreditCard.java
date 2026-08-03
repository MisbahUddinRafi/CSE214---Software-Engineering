package behavioral_dp_practice.strategy_dp.payment_system;

public class CreditCard implements PaymentMethod {
    private String cardNumber; 
    private String holderName; 
    private final double processingFeePercentage = 0.02; 
    private final double maxPaymentLimit = 100000; 

    public CreditCard(String cardNumber, String holderName) {
        this.cardNumber = cardNumber; 
        this.holderName = holderName; 
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getProcessingFeePercentage() {
        return processingFeePercentage;
    }

    public double getMaxPaymentLimit() {
        return maxPaymentLimit;
    }

    @Override
    public boolean pay(double amount) {
        if (amount > maxPaymentLimit || amount <= 0) {
            return false; 
        } 

        double finalAmount = amount + amount * processingFeePercentage; 
        System.out.println("Credit Card Payment of amount " + finalAmount + " successful. Processing Fee: " + (processingFeePercentage*100) + "%");  
        return true; 
    } 

    
    

}
