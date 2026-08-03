package creational_dp_practice.abstract_factory_dp.furniture_shop;

class VintageChair implements Chair {
    @Override 
    public void sit() {
        System.out.println("Sit on Vintage Chair");
    }
}


class VintageSofa implements Sofa {
    @Override 
    public void sit() {
        System.out.println("Sit on Vintage Sofa");
    }
} 


class VintageTable implements Table {
    @Override 
    public void placeItems() {
        System.out.println("Place Items on Vintage Table");
    }
} 


public class VintageFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VintageChair();
    }

    @Override
    public Sofa createSofa() {
        return new VintageSofa();
    }

    @Override
    public Table createTable() {
        return new VintageTable();
    }
    
}
