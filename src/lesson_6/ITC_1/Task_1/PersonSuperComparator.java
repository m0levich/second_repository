package lesson_6.ITC_1.Task_1;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int result = (o1.getName()).compareTo(o2.getName());
//        return result;

        if (result != 0) {
            return result;
        }

//        Integer x1 = ((Person) o1).getAge();
//        Integer x2 = ((Person) o2).getAge();
//        return x1.compareTo(x2);
        return o1.getAge() - o2.getAge();
    }
}


