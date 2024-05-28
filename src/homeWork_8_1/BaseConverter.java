package homeWork_8_1;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Celsius celsius = new Celsius();
        Fahrenheit fahrenheit = new Fahrenheit();
        Kelvin kelvin = new Kelvin();

        System.out.print("Enter the value to convert: ");
        double temp = scanner.nextDouble();



        System.out.println("The temperature in Celsius is: " + celsius.getCovert(temp));
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit.getCovert(temp));
        System.out.println("The temperature in Kelvin is: " + kelvin.getCovert(temp));

        scanner.close();
    }
}
