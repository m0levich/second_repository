package lesson_3.ITC_1;

import java.util.Scanner;

public class Task_3 {
    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public void run(int n) {
        System.out.println("Число Фибоначчи равно: " + fibonacci(n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите искомое число Фибоначчи: ");
        int n = scanner.nextInt();
        Task_3 task = new Task_3();
        task.run(n);

    }
}
