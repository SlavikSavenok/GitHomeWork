package homeWork_5;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {

        char[][] massivWandB = new char[8][8];


        for (int i = 0; i < massivWandB.length; i++) {
            for (int j = 0; j < massivWandB.length; j++) {
                if ((i + j) % 2 == 0) {
                    massivWandB[i][j] = 'W';
                } else {
                    massivWandB[i][j] = 'B';
                }
            }
            System.out.println(Arrays.toString(massivWandB[i]));
        }
    }
}

