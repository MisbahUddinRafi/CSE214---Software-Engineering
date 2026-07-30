package abstract_factory_dp.furniture_shop;


class ModernChair implements Chair { 
    @Override
    public void sit() {
        System.out.println("Sit on Modern Chair");
    }
} 


class ModernSofa implements Sofa { 
    @Override
    public void sit() {
        System.out.println("Sit on Modern Sofa");
    }
} 


class ModernTable implements Table { 
    @Override
    public void placeItems() {
        System.out.println("Place Items on Modern Table");
    }
}


public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair(); 
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa(); 
    }

    @Override
    public Table createTable() {
        return new ModernTable(); 
    }
    
}
