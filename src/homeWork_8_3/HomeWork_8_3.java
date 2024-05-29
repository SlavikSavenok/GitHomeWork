package homeWork_8_3;


import java.util.Random;
import java.util.Scanner;

import static homeWork_8_3.AnimalEnum.*;


public class HomeWork_8_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select array size: ");
        int size = scanner.nextInt();

        AnimalEnum[] animals = new AnimalEnum[size];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = selectAnimal();
        }
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].name());
        }


        System.out.println("Choose an action: 1.Swim  2.Eat  3.Fly  4.Say ");
        int choiseAction = scanner.nextInt();

        for (int i = 0; i < animals.length; i++) {
            switch (choiseAction) {
                case 1:
                    if (animals[i] == KRAKEN || animals[i] == LEVIATHAN)
                        System.out.println(animals[i].getSwim());
                    break;
                case 2:
                    System.out.println(animals[i].getEat());
                    break;
                case 3:
                    if (animals[i] == PHOENIX || animals[i] == PEGASUS)
                        System.out.println(animals[i].getFly());
                    break;
                case 4:
                    if (animals[i] == UNICORN || animals[i] == PHOENIX || animals[i] == PEGASUS || animals[i] == CERBERUS)
                        System.out.println(animals[i].getSay());
                default:
                    System.out.println("Incorrect choice");
            }

        }

    }

    public static AnimalEnum selectAnimal() {
        Random random = new Random();

        int selectFlag = random.nextInt(6);
        if (selectFlag == 0)
            return AnimalEnum.UNICORN;
        if (selectFlag == 1)
            return AnimalEnum.CERBERUS;
        if (selectFlag == 2)
            return AnimalEnum.KRAKEN;
        if (selectFlag == 3)
            return AnimalEnum.PEGASUS;
        if (selectFlag == 4)
            return LEVIATHAN;
        else return AnimalEnum.PHOENIX;
    }
}













