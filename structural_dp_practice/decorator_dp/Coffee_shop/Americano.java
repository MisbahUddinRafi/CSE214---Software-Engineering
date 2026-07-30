package Coffee_shop; 

public class Americano implements Coffee {
    private double price = 5;

    public Americano() {}

    @Override
    public String getDescription() {
        return "Americano";
    }

    @Override
    public double getPrice() {
        return price;
    } 

}