package Coffee_shop;

public class Main { 
    public static void main(String[] args) {
        Coffee c1 = new Espresso(); 
        c1 = new MilkDecorator(c1); 

        System.out.println(c1.getDescription() + " " + c1.getPrice()); 

        c1 = new SugarDecorator(c1); 
        c1 = new ChocolateSyrupDecorator(c1); 

        System.out.println(c1.getDescription() + " " + c1.getPrice());
    }
    
}
