package Task3;
import java.util.ArrayList;
import java.util.List;

public class MyCollections extends Collections {
    List col = new ArrayList();

    @Override
    public boolean add(Object info) {
        for (int i = 0; i < col.size(); i++) {
            if (info.equals(col.get(i))) {
                col.remove(col.get(i));
            }
        }
        return col.add(info);
    }

    public static void main(String[] args) {
        MyCollections c = new MyCollections();
        c.add(5);
        c.add(54);
        c.add(5);
        System.out.println(c.col);

    }
}
