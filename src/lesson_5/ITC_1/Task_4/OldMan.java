package lesson_5.ITC_1.Task_4;

public class OldMan extends Human {
    @Override
    public void run() {
        System.out.println("I run a little");
    }

    @Override
    public void step() {
        System.out.println("I often walk");
    }

    @Override
    public void swim() {
        System.out.println("Swimming in the pool");
    }

    @Override
    public void getName() {
        System.out.println("Деда");
    }
}
