package prototype_dp.graphic_editor;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(10, 20, 15, "red"); 
        Rectangle r1 = new Rectangle(25, 30, 8, 12, "pink"); 

        Circle c2 = c1.clone(); 
        Rectangle r2 = r1.clone(); 

        c2.setColor("blue"); 
        c2.setRadius(18);  
        
        r2.setColor("violet"); 
        r2.setWidth(12); 
        r2.setHeight(8); 

        c1.draw(); 
        c2.draw(); 
        r1.draw(); 
        r2.draw();
    }
}
