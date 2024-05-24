package homeWork_7_1;

public class Circle implements CalculatePerimeter,CalculateSquar {
    double diametr;
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public Circle(double diametr, double radius) {
        this.diametr = diametr;
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return diametr*Math.PI;
    }

    @Override
    public double getSquar() {
        return 2*Math.PI*radius;
    }
}
