package abstract_factory_dp.furniture_shop;

public class Main { 
    public static void main(String[] args) {
        // factory object 
        FurnitureFactory factory; 

        // Modern factory furniture 
        factory = new ModernFurnitureFactory(); 

        Chair c1 = factory.createChair(); 
        Sofa s1 = factory.createSofa(); 
        Table t1 = factory.createTable(); 

        c1.sit(); s1.sit(); t1.placeItems(); 
        System.out.println();


        // Victorian factory furniture 
        factory = new VictorianFurnitureFactory(); 

        Chair c2 = factory.createChair(); 
        Sofa s2 = factory.createSofa(); 
        Table t2 = factory.createTable(); 

        c2.sit(); s2.sit(); t2.placeItems(); 
        System.out.println();


        // Vintage factory furniture 
        factory = new VintageFurnitureFactory(); 

        Chair c3 = factory.createChair(); 
        Sofa s3 = factory.createSofa(); 
        Table t3 = factory.createTable(); 

        c3.sit(); s3.sit(); t3.placeItems(); 
    }
    
}
