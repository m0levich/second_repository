package lesson_1.ITC_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Это число: ");
        if (a % 2 == 0) System.out.print("четное, ");
        else System.out.print("нечетное, ");
        if (a > 0) System.out.print("положительное");
        else if (a < 0) System.out.println("отрицательное");
        else System.out.println("не относится ни к положительным, ни к отрицательным, тк это НОЛЬ");
    }
}
