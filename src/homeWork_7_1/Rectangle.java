package homeWork_7_1;

public class Rectangle implements CalculatePerimeter, CalculateSquar{
    double sideA;
    double sideB;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return sideA+sideB+sideB+sideA;
    }

    @Override
    public double getSquar() {
        return sideA*sideB;
    }
}
