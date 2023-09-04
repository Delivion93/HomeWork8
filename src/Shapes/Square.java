package Shapes;

public class Square extends Rectangle{


    public Square(double sideA) {
        super(sideA,sideA);
    }

    @Override
    public String getShapeName() {
        return "Square";
    }
}
