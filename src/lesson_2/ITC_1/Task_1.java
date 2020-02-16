package lesson_2.ITC_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Beverage drink_1 = new Beverage("Sprite", 55, 0.33f);
        Beverage drink_2 = new Beverage("Coca-cola", 50, 0.33f);
        Beverage drink_3 = new Beverage("Fanta", 65, 0.5f);
        Beverage drink_4 = new Beverage("7UP", 55, 0.33f);
        Beverage drink_5 = new Beverage("Moutain Dew", 55, 0.5f);
        Beverage drink_6 = new Beverage("Sprite", 55, 0.33f);
        Beverage drink_7 = new Beverage("Pepsi", 75, 0.5f);
        Beverage drink_8 = new Beverage("Burn", 87, 0.33f);
        Beverage drink_9 = new Beverage("Red Bull", 105, 0.5f);
        Beverage drink_10 = new Beverage("BonAqua", 40, 0.5f);

        Beverage [] beverages = new Beverage[]{drink_1, drink_2, drink_3, drink_4, drink_5, drink_6, drink_7, drink_8, drink_9, drink_10};

        int balance = 0;
        while(true){
            if (balance != 0){
                System.out.println("Ваш баланс: "+ balance +" руб. Чтобы забрать сдачу, введите 1, либо любое число, чтобы продолжить");
                int answer = scanner.nextInt();
                if (answer == 1){
                    balance = 0;
                    System.out.println("Заберите сдачу");
                    System.out.println();
                    continue;
                }
            }
            for (int i = 0; i < beverages.length; i++){
                System.out.println("№ "+ (i+1) +". Напиток: "+ beverages[i].name + " Цена: "+ beverages[i].price +" руб. Объем: "+ beverages[i].volume + " л " + "Остаток " + beverages[i].count);
            }
            int number = 0;
            System.out.println();
            System.out.print("Введите номер напитка: ");
            number = scanner.nextInt();

            if (number > beverages.length || number < 1){
                System.out.println("Такого номера напитка нет");
                System.out.println();
                continue;
            }
            else System.out.println("Вы выбрали напиток " + number + ", его цена: " + beverages[number-1].price + " руб");

            if (beverages[number-1].count <= 0){
                System.out.println("Напиток закончился\n");
                continue;
            }

            System.out.print("Ваш баланс равен: " + balance + " руб. Пополните баланс: ");
            balance += scanner.nextInt();

            if (balance >= beverages[number-1].price){
                System.out.println("Возьмите ваш напиток");
                beverages[number-1].count--;
                System.out.println();
                balance -= beverages[number-1].price;
            }
            else {
                System.out.println("Недостаточно средств");
                System.out.println();
                continue;
            }
        }
    }
}
