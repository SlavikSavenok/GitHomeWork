package homeWork_8_1;

public class Kelvin implements Convert {

    public Kelvin() {
    }

    @Override
    public double getCovert(double temp) {
        return temp + 273.15;
    }
}
