package behavioral_dp_practice.strategy_dp.payment_system;

public class Main {
    public static void main(String[] args) {

        Customer rafi = new Customer(
                "Rafi",
                "C001",
                new CreditCard("123456789", "Rafi"));

        rafi.checkout(5000);
        System.out.println();

        rafi.setPaymentMethod(new Bkash("Rafi", "01711111111"));

        rafi.checkout(6000);
        System.out.println();

        rafi.setPaymentMethod(new CreditCard("123456789", "Rafi"));

        rafi.checkout(150000);
        System.out.println();
    }

}
