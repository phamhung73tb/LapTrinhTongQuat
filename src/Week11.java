import java.util.ArrayList;
import java.util.List;

public class Week11 {

    /**
     * Swap 2 objects.
     *
     * @param list list
     * @param a    vitri a
     * @param b    vitri b
     * @param <T>  Object
     * @return list
     */
    private static <T> List<T> swap(List<T> list, int a, int b) {
        T temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
        return list;
    }

    /**
     * Sort.
     *
     * @param list list
     * @param <T>  object
     * @return sort
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            int posMin = 0;
            T valueMin = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                T valueCurrent = list.get(j);
                if (valueMin.compareTo(valueCurrent) > 0) {
                    posMin = j;
                    valueMin = list.get(j);
                }
            }
            if (posMin > 0) {
                swap(list, i, posMin);
            }
        }
        return list;
    }

    /**
     * main.
     *
     * @param args main
     */
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Hung", 17, "a");
        Person person2 = new Person("Hung", 18, "a");
        Person person3 = new Person("Tu", 20, "b");
        Person person4 = new Person("Hai", 30, "a");
        people.add(person4);
        people.add(person3);
        people.add(person2);
        people.add(person1);
        sortGeneric(people);
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName() + " " + people.get(i).getAge());
        }
    }
}
 