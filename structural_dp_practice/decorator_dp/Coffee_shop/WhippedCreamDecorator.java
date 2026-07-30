package Coffee_shop;

public class WhippedCreamDecorator extends CoffeeDecorator {
    private double whippedCreamPrice = 1.5; 

    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whipped Cream"; 
    } 

    @Override 
    public double getPrice() {
        return coffee.getPrice() + whippedCreamPrice; 
    }
}
