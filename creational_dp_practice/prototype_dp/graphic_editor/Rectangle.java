package creational_dp_practice.prototype_dp.graphic_editor;

public class Rectangle implements Shape { 
    private double x; 
    private double y; 
    private double width; 
    private double height; 
    private String color; 
    
    public Rectangle(double x, double y, double width, double height, String color) {
        this.x = x;
        this.y = y;
        this.width = width; 
        this.height = height; 
        this.color = color;
    }

    @Override
    public Rectangle clone()  {        
        return new Rectangle(x, y, width, height, color); 
    }

    @Override
    public void draw() {
        System.out.println();
        System.out.println("-".repeat(8) + " Rectangle " + "-".repeat(8)); 
        System.out.println("position \t: (" + x + ", " + y + ")");
        System.out.println("size \t\t: " + width + " x " + height);  
        System.out.println("color \t\t: " + color); 
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    } 
    
    
}
