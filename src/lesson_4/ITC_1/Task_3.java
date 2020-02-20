package lesson_4.ITC_1;

public class Task_3 {

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double percent(double a, double b) {
        return a * b / 100;
    }


    public static void main(String[] args) {
        System.out.println("Вычитание: " + subtraction(2, 23.2));
        System.out.println("Сложение: " + addition(2, 23.2));
        System.out.println("Деление: " + division(1, 3));
        System.out.println("Умножение: " + multiplication(0.33, 0.33));
        System.out.println("Процент: " + percent(23.23, 12.1));
    }
}
