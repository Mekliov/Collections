package Task5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Rotate {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(55);
        list.add(666);
        list.add(777);
        list.add(0, 254);

        System.out.println(rotate(list, 3));
    }

    public static Collection<Integer> rotate(Collection<Integer> obj, int rotateStep) {
       List list = new ArrayList();
      Collections.rotate((List<?>) obj, 1);
       
        return obj;
        

    }

}
