package behavioral_dp_practice.strategy_dp.payment_system;

public class PaymentService {
    private PaymentMethod paymentMethod; 

    public PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod; 
    } 

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod; 
    } 

    public boolean checkout(double amount) {
        return paymentMethod.pay(amount); 
    }
}
