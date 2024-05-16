import java.util.Arrays;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] massivForDiagonals = new int[5][5];
        System.out.println("Массив: ");

        for (int i = 0; i < massivForDiagonals.length; i++) {
            for (int j = 0; j < massivForDiagonals[i].length; j++) {
                massivForDiagonals[i][j] = random.nextInt(10);

            }
            System.out.println(Arrays.toString(massivForDiagonals[i]));

        }
        System.out.println("Перая диагональ: ");
        for (int i = 0; i < massivForDiagonals.length; i++) {
            int diagonal;
            diagonal = massivForDiagonals[i][i];
            System.out.print(diagonal + " ");

        }
        System.out.println(" ");
        System.out.println("Вторая диагональ: ");
        for (int i = 0; i < massivForDiagonals.length; i++) {
            int diagonalToo = massivForDiagonals[i][massivForDiagonals.length - i - 1];
            System.out.print(diagonalToo +" ");
        }
    }
}

