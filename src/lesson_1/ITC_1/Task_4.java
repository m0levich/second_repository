package lesson_1.ITC_1;

import java.io.IOException;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер геометрической прогрессии: ");
        int a = scanner.nextInt();

        System.out.print("Введите шаг: ");
        int b = scanner.nextInt();

        System.out.print("Введите первый элемент: ");
        int c = scanner.nextInt();

        System.out.println("Результат: ");
        for (int i = 0; i < a; i++)
        {
            System.out.print(c + " ");
            if (i != a - 1) c *= b;
        }
    }
}