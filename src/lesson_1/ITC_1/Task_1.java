package lesson_1.ITC_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = input.nextInt();
        System.out.print("Введите первое число: ");
        int b = input.nextInt();

        System.out.println("Минимальное значение равно: " + getMin(a, b));

    }

    public static int getMin(int a, int b) {
        int c = a < b ? a : b;
        return c;
    }
}
