public class Rectangle extends Shape {
    private double width;
    private double length;

    //Constructor không tham số
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    //Constructor không tham số
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //Constructor 3 tham số
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    //Getter
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    //Setter
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    //getArea
    public double getArea(){
        return width * length;
    }
    //getPerimeter
    public double getPerimeter(){
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of " + super.toString();
    }
}
