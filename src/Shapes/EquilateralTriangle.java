package Shapes;

public class EquilateralTriangle extends Triangle{

    public EquilateralTriangle(double sideSize) {
        sideA = sideSize;
        sideB = sideSize;
        sideC = sideSize;
    }
    public double getArea(){
        return (Math.sqrt(3)*sideA)/3;
    }
    public double getSide(){
        return sideA;
    }
    @Override
    public String getShapeName() {
        return "EquilateralTriangle";
    }

}
