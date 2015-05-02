package Task2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class Reverse  {

    public static void CollectionReverse () {
     List<Integer> list = new ArrayList<Integer>();
     list.add(5);
     list.add(55);
     list.add(666);
     list.add(777);
     Iterator<Integer> iterator=reverse(list).iterator();
    for(int i=0;i<list.size();i++)
    {
        System.out.println(list.get(i));
    }

    }
    public static Collection<Integer> reverse(Collection<Integer> obj)
    {
        int i=0;
        int arr[]= new int[obj.size()];
        Iterator<Integer> iterator= obj.iterator();
        while(iterator.hasNext())
        {
            arr[i]=iterator.next();
            i++;
        }
        obj.clear();
        for(int i1=arr.length-1; i1>=0;i1--)
        {
            obj.add(arr[i1]);
            
        }
        return obj;
        
    }
}