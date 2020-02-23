package lesson_6.ITC_1.Task_2;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        BasketClass basketClass = new BasketClass();

        basketClass.addProduct("Шоколад", 5);
        basketClass.updateProductQuantity("Шоколад", 6);
        basketClass.addProduct("Хлеб", 3);

        System.out.println(basketClass.getProducts());


//        System.out.println(basketClass.basket);
//        for (String key : basketClass.basket.keySet()) {
//            System.out.println(key);
//        }
    }
}
