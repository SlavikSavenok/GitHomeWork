package homeWork_7_1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(2, 3);
        Triangle triangle = new Triangle(3, 2, 2, 1.98);
        Circle circle = new Circle(3.2, 6.4);
        System.out.println("The area of the figures is: Rectangle=" + rectangle.getSquar() + " Triangle=" + triangle.getSquar() + " Circle=" + circle.getSquar());

        System.out.print("Enter array size array: ");
        int size = scanner.nextInt();
        CalculatePerimeter[] calculatePerimeters = new CalculatePerimeter[size];
        for (int i = 0; i < calculatePerimeters.length; i++) {
            calculatePerimeters[i] = calculate();
        }
        int sum = 0;
        for (int i = 0; i < calculatePerimeters.length; i++) {

            sum += calculatePerimeters[i].getPerimeter();

        }
        System.out.println("The sum of the areas of the figures is equal to: " + sum);

    }

    public static CalculatePerimeter calculate() {
        Random random = new Random();

        int randomFlag = random.nextInt(4);
        if (randomFlag == 0)
            return new Circle(3.2, 6.4);
        if (randomFlag == 1)
            return new Rectangle(2, 3);
        else return new Triangle(3, 2, 2, 1.98);

    }

}










