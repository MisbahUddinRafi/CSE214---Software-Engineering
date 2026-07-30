package Coffee_shop;

public class ChocolateSyrupDecorator extends CoffeeDecorator {
    private double chocolateSyrupPrice = 2; 

    public ChocolateSyrupDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Chocolate Syrup"; 
    } 

    @Override 
    public double getPrice() {
        return coffee.getPrice() + chocolateSyrupPrice; 
    }
}