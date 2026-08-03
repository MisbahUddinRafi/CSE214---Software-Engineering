package behavioral_dp_practice.strategy_dp.payment_system;

public class Customer {
    private String name; 
    private String customerId; 
    private PaymentService paymentService;  

    public Customer(String name, String customerId, PaymentMethod paymentMethod) {
        this.name = name; 
        this.customerId = customerId; 
        this.paymentService = new PaymentService(paymentMethod);  
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    } 

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentService.setPaymentMethod(paymentMethod); 
    } 

    public void checkout(double amount) {
        System.out.println("-".repeat(32));
        System.out.println("Customer : " + name);
        System.out.println("Amount : " + amount);

        boolean success = paymentService.checkout(amount);

        if(success) {
            System.out.println("Payment Successful");
        } else {
            System.out.println("Payment Failed"); 
        }

        System.out.println("-".repeat(32));

    }
    
}
