package Shapes;

public class Circle extends Shape{
    public static final double PI = 3.14159265d;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    private double getRadius(){
        return radius;
    }
    public double getDiameter(){
        return radius*2;
    }
    public double getArea(){
        return PI*Math.pow(radius,2);
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }
}
