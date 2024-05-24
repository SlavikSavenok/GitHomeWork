package homeWork_7_1;

public class Circle implements CalculatePerimeter,CalculateSquar {

    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return (radius*2)*Math.PI;
    }

    @Override
    public double getSquar() {
        return 2*Math.PI*radius;
    }
}
