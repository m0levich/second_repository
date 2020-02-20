package lesson_4.ITC_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String s = scanner.nextLine();
        censure(s);
        System.out.println(censure(s));
    }


    public final static String censure(String s) {
        final String s2 = s.replaceAll("бяка", "вырезано цензурой");
        return s2;
    }
}
