package Task6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class DuplicateValues {

    public static void main(String[] args) {
        Collection<Integer> ints = Arrays.asList(1, 2, 2, 4, 5, 5, 4, 3, 1);
        duplicate(ints);

    }

    public static void duplicate(Collection<Integer> obj) {
        List list = new ArrayList();
        List list1 = new ArrayList();
        list.addAll(obj);
        ListIterator it = list.listIterator();
        while (it.hasNext()) {
            Object t = it.next();
            it.remove();
            if (list.contains(t) == true) {
                list1.add(t);

            }
            it.add(t);
        }
        list.removeAll(list1);
        System.out.println(list);

    }
}
