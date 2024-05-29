package homeWork_8_1;

public class Fahrenheit implements Converter {

    public Fahrenheit() {
    }

    @Override
    public double getCovert(double temp) {
        return 1.8 * temp + 32;
    }
}
