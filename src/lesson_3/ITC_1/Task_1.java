package lesson_3.ITC_1;

import java.util.Arrays;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30);
        }

        System.out.println(Arrays.toString(array));

        int max, count = 0;

        for (int swaps = 1, i = 0; swaps > 0; i++) {
            swaps = 0;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    max = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = max;
                    swaps++;
                }
                count++;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(count);
    }
}
