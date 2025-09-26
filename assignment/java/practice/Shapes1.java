package assignment.java.practice;

abstract class Shapes {
 abstract double area();
}
 
 
class Circlee extends Shapes {
    private double radius;
 
    
    public Circlee(double radius) {
        this.radius = radius;
    }
 
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
 
 
class Rectangle extends Shapes {
    private double length;
    private double width;
 
  
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
 
  
    double area() {
        return length * width;
    }
}
 
public class Shapes1{
    public static void main(String[] args) {
        Shapes circle = new Circlee(1);
        Shapes rectangle = new Rectangle(5, 8);
 
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
 	 