package lesson_5.ITC_1.Task_2and3;

public class Test {
    public static void main(String[] args) {
        Frog frog = new Frog();
        Duck duck = new Duck();
        Cat cat = new Cat();
        // Animal animal = new Animal(); - нельзя создать, тк он абстрактный
        frog.getName();
        frog.run();
        frog.swim();
        System.out.println();
        duck.getName();
        duck.fly();
        duck.run();
        duck.swim();
        System.out.println();
        cat.getName();
        cat.run();
    }
}
