import java.util.Arrays;
import java.util.Random;

public class Task_2{
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[5][5];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);

                sum += arr[i][j];

            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("сумма массива: " + sum);

    }
}
