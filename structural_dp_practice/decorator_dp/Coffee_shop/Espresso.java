package structural_dp_practice.decorator_dp.Coffee_shop;

public class Espresso implements Coffee {
    private double price = 4; 

    public Espresso() {}

    @Override
    public String getDescription() {
        return "Espresso"; 
    }

    @Override
    public double getPrice() {
        return price;
    } 
}
