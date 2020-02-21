package lesson_5.ITC_1.Task_2and3;

public class Duck extends Animal implements Swim, Fly, Run {

    @Override
    public void getName() {
        System.out.println("I am a dog");
    }

    @Override
    public void fly() {
        System.out.println("I fly");
    }

    @Override
    public void run() {
        System.out.println("I run");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
