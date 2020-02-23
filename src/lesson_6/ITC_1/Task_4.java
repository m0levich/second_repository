package lesson_6.ITC_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task_4 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.addAll(Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"));
        removeEvenLength(set);
        System.out.println(set);
    }

    public static Set<String> removeEvenLength(Set<String> set) {
        set.removeIf(n -> (n.length() % 2 == 0));
        return set;
    }
}
