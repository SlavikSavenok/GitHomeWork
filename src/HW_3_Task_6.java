import java.util.Arrays;
import java.util.Random;

public class HW_3_Task_6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayForSort = new int[10];
        System.out.println("Массив:");

        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = random.nextInt(11);

        }
        System.out.println(Arrays.toString(arrayForSort));

        int indexSort = arrayForSort.length - 1;
        for (int i = 0; i < indexSort; i++) {
            for (int j = 0; j < indexSort - i; j++) {
                if (arrayForSort[j] < arrayForSort[j + 1]) {
                    int temp = arrayForSort[j + 1];
                    arrayForSort[j + 1] = arrayForSort[j];
                    arrayForSort[j] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        System.out.println(Arrays.toString(arrayForSort));
    }
}
