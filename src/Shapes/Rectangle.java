package Shapes;

public class Rectangle extends Quadrangle{


    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }



    public double getArea(){
        return sideA*sideB;
    }
    @Override
    public String getShapeName() {
        return "Rectangle";
    }
}



