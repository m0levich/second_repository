package lesson_3.ITC_1;

import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        int array [][] = new int[n][n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array [i][j] = random.nextInt(10);
            }
        }

        System.out.println("\nРезультат рандома: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array [i][j] + " ");
            }
            System.out.println();
        }

        int sumDiagonal = 0;

        for (int i = 0; i < n; i++) {
                sumDiagonal += array[i][i] + array[i][n - i - 1];
        }
        if(n%2!=0){
            sumDiagonal -= array[(n-1)/2][(n-1)/2];
        }

        System.out.println("\nСумма диагонали массива равна: " + sumDiagonal);
    }
}
