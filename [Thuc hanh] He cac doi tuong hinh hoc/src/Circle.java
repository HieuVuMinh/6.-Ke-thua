import java.awt.*;

public class Circle extends Shape{
    private double radius;

    //Constructor không đối số
    public Circle(){
        this.radius = 1.0;
    };
    //Constructor một đối số
    public Circle(double radius){
        this.radius = radius;
    }
    //Constructor 3 đối số
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    //Getter
    public double getRadius() {
        return radius;
    }
    //Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //getArea
    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
    //getPerimeter
    public double doublegetPerimeter(){
        return ((Math.pow(radius*2, 2))/4) * Math.PI;
    }
    //Cài đè
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
