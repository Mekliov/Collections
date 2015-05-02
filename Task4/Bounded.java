package Task4;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bounded extends BoundedQueue {
    Queue col = new LinkedList();

    @Override
    public boolean add(Object arg0) {
        if (col.size() > 2) {
            col.poll();
        
        }
        return col.add(arg0);
    }

    @Override
    public String toString() {

        return col.toString();
    }

    public static void main(String[] args) {
        Bounded b = new Bounded();
        b.add(5);
        b.add(55);
        b.add(44);
        b.add(7);
        b.add(565);
        b.add(444);

        System.out.println(b.toString());
    }
}
