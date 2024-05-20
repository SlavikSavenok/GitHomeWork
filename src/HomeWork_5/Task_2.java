package HomeWork_5;

import java.util.Arrays;
import java.util.Random;

public class Task_2{
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arrayTaskTwo = new int[5][5];
        int sum = 0;

        for (int i = 0; i < arrayTaskTwo.length; i++) {
            for (int j = 0; j < arrayTaskTwo[i].length; j++) {
                arrayTaskTwo[i][j] = random.nextInt(10);

                sum += arrayTaskTwo[i][j];

            }
            System.out.println(Arrays.toString(arrayTaskTwo[i]));
        }
        System.out.println("сумма массива: " + sum);

    }
}
