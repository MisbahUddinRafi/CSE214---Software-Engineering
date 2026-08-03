package structural_dp_practice.decorator_dp.Coffee_shop;

public class MilkDecorator extends CoffeeDecorator {
    private double milkPrice = 1; 

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk"; 
    } 

    @Override 
    public double getPrice() {
        return coffee.getPrice() + milkPrice; 
    }
}
