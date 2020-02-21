package lesson_5.ITC_1.Task_4;

import org.w3c.dom.ls.LSOutput;

public class AdultMan extends Human {
    @Override
    public void run() {
        System.out.println("I run well");
    }

    @Override
    public void step() {
        System.out.println("I rarely walk");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming well");
    }

    @Override
    public void getName() {
        System.out.println("Взрослый");
    }
}
