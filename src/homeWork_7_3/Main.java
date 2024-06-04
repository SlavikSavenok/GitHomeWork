package homeWork_7_3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select array size: ");

        int size = -1;

        try {
            size = scanner.nextInt();
            Animal[] animals = new Animal[size];
        } catch (InputMismatchException e) {
            System.err.println("Input Error: you only need to enter numbers");
        } catch (NegativeArraySizeException e) {
            System.err.println("Input Error: you entered a negative integer value");
        }

        Animal[] animals = new Animal[size];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = choiseAnimal();
        }
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getName());
        }

        System.out.println("Choise action: 1.Fly, 2.Say, 3.Eat, 4.Swim.");

        int choiseAction = -1;
        boolean inPutFlag = false;
        do {
            try {
                choiseAction = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Input Error: you only need to enter numbers");
                continue;
            }
            inPutFlag =true;
        }while (!inPutFlag);


        for (int i = 0; i < animals.length; i++) {
            if (choiseAction == 1) {
                System.out.println(animals[i].getFly());
            } else if (choiseAction == 2) {
                System.out.println(animals[i].getSay());
            } else if (choiseAction == 3) {
                System.out.println(animals[i].getEat());
            } else if (choiseAction == 4) {
                System.out.println(animals[i].getSwim());
            } else {
                System.err.println("Choise error");
                break;
            }
        }
    }

    public static Animal choiseAnimal() {
        Random random = new Random();
        int choiseFlag = random.nextInt(7);
        if (choiseFlag == 0)
            return new Cat("Cat", 2);
        if (choiseFlag == 1)
            return new Fish("Fish", 1);
        if (choiseFlag == 2)
            return new Raven("Raven", 3);
        if (choiseFlag == 3)
            return new Python("Python", 4);
        if (choiseFlag == 4)
            return new Rhinoceros("Rhinoceros", 5);
        else {
            return new Lama("Lama", 6);
        }
    }
}