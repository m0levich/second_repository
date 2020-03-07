package lesson_3.ITC_1;

import java.util.Scanner;

public class Task_3 {

    private static int fibonacchi(int index) {
        if (index <= 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else if (index == 2) {
            return 1;
        } else {
            return fibonacchi(index - 1) + fibonacchi(index - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну последовательности:");
        int n = scanner.nextInt();
        System.out.println("Последовательность чисел Фибоначчи до указанного номера в последовательности:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacchi(i) + " ");
        }
    }
}
