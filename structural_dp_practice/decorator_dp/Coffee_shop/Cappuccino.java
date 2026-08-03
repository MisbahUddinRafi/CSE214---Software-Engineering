package structural_dp_practice.decorator_dp.Coffee_shop;

public class Cappuccino implements Coffee {
    private double price = 6;

    public Cappuccino() {
    }

    @Override
    public String getDescription() {
        return "Cappuccino"; 
        
    }

    @Override
    public double getPrice() {
        return price; 
    } 
    
}
