package lesson_5.ITC_1.Task_4;

public class Children extends Human {
    @Override
    public void run() {
        System.out.println("I like running");
    }

    @Override
    public void step() {
        System.out.println("I like walking");
    }

    @Override
    public void swim() {
        System.out.println("I like swimming");
    }

    @Override
    public void getName() {
        System.out.println("Ребенок");
    }
}
