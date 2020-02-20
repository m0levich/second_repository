package lesson_5.ITC_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Beverages sprite = Beverages.Sprite;
        Beverages coca_cola = Beverages.Coca_cola;
        Beverages fanta = Beverages.Fanta;
        Beverages sevenup = Beverages.SEVENUP;
        Beverages mountain_dew = Beverages.Moutain_DEW;
        Beverages mirinda = Beverages.Mirinda;
        Beverages pepsi = Beverages.Pepsi;
        Beverages burn = Beverages.Burn;
        Beverages red_bull = Beverages.Red_Bull;
        Beverages bonAqua = Beverages.BonAqua;

        Beverages[] beverages = new Beverages[]{sprite, coca_cola, fanta, sevenup, mountain_dew, mirinda, pepsi, burn, red_bull, bonAqua};

        int balance = 0;
        while (true) {
            if (balance != 0) {
                System.out.println("Ваш баланс: " + balance + " руб. Чтобы забрать сдачу, введите 1, либо любое число, чтобы продолжить");
                int answer = scanner.nextInt();
                if (answer == 1) {
                    balance = 0;
                    System.out.println("Заберите сдачу");
                    System.out.println();
                    continue;
                }
            }
            for (int i = 0; i < beverages.length; i++) {
                System.out.println("№ " + (i + 1) + ". Напиток: " + beverages[i].getName() + " Цена: " + beverages[i].getPrice() + " руб. Объем: " + beverages[i].getVolume() + " л " + "Остаток " + beverages[i].getCount());
            }
            int number = 0;
            System.out.println();
            System.out.print("Введите номер напитка: ");
            number = scanner.nextInt();

            if (number > beverages.length || number < 1) {
                System.out.println("Такого номера напитка нет");
                System.out.println();
                continue;
            } else
                System.out.println("Вы выбрали напиток " + number + ", его цена: " + beverages[number - 1].getPrice() + " руб");

            if (beverages[number - 1].getCount() <= 0) {
                System.out.println("Напиток закончился\n");
                continue;
            }

            System.out.print("Ваш баланс равен: " + balance + " руб. Пополните баланс: ");
            balance += scanner.nextInt();

            if (balance >= beverages[number - 1].getPrice()) {
                System.out.println("Возьмите ваш напиток");
                beverages[number - 1].setCount(beverages[number - 1].getCount() - 1);
                System.out.println();
                balance -= beverages[number - 1].getPrice();
            } else {
                System.out.println("Недостаточно средств");
                System.out.println();
                continue;
            }
        }
    }
}