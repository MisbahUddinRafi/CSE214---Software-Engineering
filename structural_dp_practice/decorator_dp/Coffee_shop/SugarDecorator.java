package structural_dp_practice.decorator_dp.Coffee_shop;

public class SugarDecorator extends CoffeeDecorator {
    private double sugarPrice = 0.5;
    
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar"; 
    } 

    @Override 
    public double getPrice() {
        return coffee.getPrice() + sugarPrice; 
    }
}
