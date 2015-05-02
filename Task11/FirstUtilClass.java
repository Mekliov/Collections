package Task11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FirstUtilClass {

    public static String FirstUtilMethod(HashMap<? extends Object, ? extends Object> map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> en = (Entry<String, Integer>) it.next();
            sb.append(en.getKey() + " : " + en.getValue() + ", ");
        }
        return sb.toString();
    }

    public static HashMap<String, Integer> SecondUtilMethod(String string) {
        String array[] = string.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Iterator it = map.entrySet().iterator();
        for (int i = 0; i < array.length; i++) {
            int value = 1;
            if (map.containsKey(array[i]) != true) {
                map.put(array[i], value);

            } else {

                map.remove(array[i], value);
                map.put(array[i], value + 1);

            }

        }

        return map;

    }
}
