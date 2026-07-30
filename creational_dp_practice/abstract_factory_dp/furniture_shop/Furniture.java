package abstract_factory_dp.furniture_shop;

public interface Furniture {}

interface Chair extends Furniture {
    void sit();   
} 

interface Sofa extends Furniture {
    void sit(); 
}

interface Table extends Furniture {
    void placeItems(); 
}