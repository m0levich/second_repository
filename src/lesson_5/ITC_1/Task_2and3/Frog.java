package lesson_5.ITC_1.Task_2and3;

public class Frog extends Animal implements Swim, Run{

    @Override
    public void getName() {
        System.out.println("I am a frog");
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
