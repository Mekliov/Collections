package Task7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Set {

    public static void main(String[] args) {
        java.util.Set<Integer> a = new HashSet<Integer>();
        java.util.Set<Integer> b = new HashSet<Integer>();
        java.util.Set<Integer> c = new HashSet<Integer>();
        a.add(1);
        b.add(4);
        c.add(5);
        a.add(2);
        b.add(5);
        c.add(6);
        a.add(3);
        b.add(6);
        c.add(7);
        a.add(4);
        c.add(8);
        a.add(5);

        System.out.println(duplicat(a, b, c));

    }

    private static HashSet<Integer> duplicat(java.util.Set<Integer>... sets) {
        HashSet set = (HashSet) sets[0];
        for (int i = 1; i < sets.length; i++) {
            set.retainAll(sets[i]);
            System.out.println(set);
        }

        return set;
    }
}
