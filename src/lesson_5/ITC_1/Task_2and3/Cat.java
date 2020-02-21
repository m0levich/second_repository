package lesson_5.ITC_1.Task_2and3;

public class Cat extends Animal implements Run{

    @Override
    public void getName() {
        System.out.println("I am a cat");
    }

    @Override
    public void run() {
        System.out.println("I run");
    }
}
