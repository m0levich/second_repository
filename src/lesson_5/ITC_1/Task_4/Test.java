package lesson_5.ITC_1.Task_4;

public class Test {
    public static void main(String[] args) {
        Children children = new Children();
        AdultMan adultMan = new AdultMan();
        OldMan oldMan = new OldMan();
        children.getName();
        children.step();
        adultMan.getName();
        adultMan.run();
        oldMan.getName();
        oldMan.swim();
    }
}
