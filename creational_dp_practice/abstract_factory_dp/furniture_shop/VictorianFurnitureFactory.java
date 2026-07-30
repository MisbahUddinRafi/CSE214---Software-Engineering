package abstract_factory_dp.furniture_shop;


class VictorianChair implements Chair {
    @Override 
    public void sit() {
        System.out.println("Sit on Victorian Chair");
    }
}


class VictorianSofa implements Sofa {
    @Override
    public void sit() {
        System.out.println("Sit on Victorian Sofa");
    }
    
} 


class VictorianTable implements Table {
    @Override 
    public void placeItems() {
        System.out.println("Place Items on Victorian Table");
    }
}


public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair(); 
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa(); 
    }

    @Override
    public Table createTable() {
        return new VictorianTable(); 
    }
}
