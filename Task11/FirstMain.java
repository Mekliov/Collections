package Task11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class FirstMain {

    public static void main(String[] args) {
    HashMap<String,Integer> map= new HashMap<String,Integer>();
    map.put("ghg", 1);
    map.put("hgh", 2);
    map.put("ghhg", 3);
    String result1 = FirstUtilClass.FirstUtilMethod(map);
    System.out.println(result1);
    HashMap<String, Integer> result=  FirstUtilClass.SecondUtilMethod("Ninjas are all over over the place! We are all going to die!");
    System.out.println(FirstUtilClass.FirstUtilMethod(result));
    }

}
