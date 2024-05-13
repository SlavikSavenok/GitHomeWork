import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        int[][][] array3D = new int[arraySize][arraySize][arraySize];

        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    array3D[i][j][k] = random.nextInt(10);
                }
                System.out.println(Arrays.toString(array3D[i][j]));


            }
        }
        System.out.print("Задайте число увеличеия значения значеий массива: ");
        int increasingArray = scanner.nextInt();

        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    array3D[i][j][k]+=increasingArray;

                }scanner.close();
                System.out.println(Arrays.toString(array3D[i][j]));
            }
        }
    }
}