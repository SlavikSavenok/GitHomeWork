package homeWork_7_1;

public class Triangle implements CalculatePerimeter,CalculateSquar {
    double sideA;
    double sideB;
    double sdeC;
    double height;

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

    public double getSdeC() {
        return sdeC;
    }

    public void setSdeC(double sdeC) {
        this.sdeC = sdeC;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double sideA, double sideB, double sdeC, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sdeC = sdeC;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return sideA+sideB+sdeC;

    }

    @Override
    public double getSquar() {
        return  sideA /2*height;
    }
}
