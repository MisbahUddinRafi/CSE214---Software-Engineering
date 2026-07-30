package prototype_dp.graphic_editor;

public class Circle implements Shape { 
    private double x; 
    private double y; 
    private double radius;  
    private String color; 
    
    public Circle(double x, double y, double radius, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public Circle clone()  {  
        return new Circle(x, y, radius, color); 
    }

    @Override
    public void draw() {
        System.out.println();
        System.out.println("-".repeat(8) + " Circle " + "-".repeat(8)); 
        System.out.println("center \t: (" + x + ", " + y + ")");
        System.out.println("radius \t: " + radius); 
        System.out.println("color \t: " + color); 
        System.out.println(); 
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    } 
    
    
}
