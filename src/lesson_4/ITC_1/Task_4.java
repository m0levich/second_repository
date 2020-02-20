package lesson_4.ITC_1;

public class Task_4 {
    static int count = 0;

    public Task_4() {
        count++;
    }

    public static void main(String[] args) {
        Task_4 a = new Task_4();
        Task_4 b = new Task_4();
        Task_4 c = new Task_4();
        Task_4 d = new Task_4();
        Task_4 e = new Task_4();
        Task_4 f = new Task_4();

        System.out.println(count);
    }
}
