package ITC_1.main;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args){
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);

        System.out.println("Введите год: ");
        int a = input.nextInt();
        if (a % 400 == 0){
            System.out.println("количество дней в году: 366");
        }
        else if (a % 100 == 0){
            System.out.println("количество дней в году: 365");
        }
        else if (a % 4 == 0){
            System.out.println("количество дней в году: 366");
        }
        else {
            System.out.println("количество дней в году: 365");
        }
    }
}
