package Task8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Statist implements Statistics {
    static List<Integer> list = new ArrayList<Integer>();

    public int add(int num) {

        list.add(num);

        return 0;
    }

    @Override
    public int getMean() {
        int t = 0;
        for (int a = 0; a < list.size(); a++) {
            t += list.get(a);
        }

        System.out.println("The Mean is:  ");
        return t / list.size();
    }

    @Override
    public int getMedian() {
        Collections.sort(list);
        int t = list.size() / 2;
       System.out.println("The Median is: ");
        return list.get(t);
    }

    @Override
    public int getMode() {

        Object arr[] = list.toArray();
        Arrays.sort(arr);
        Integer prev = 0;
       
        Integer mostCommon = 0;
        int num = 0, max = 0;
        for (Integer counter : list) {
            if (counter.equals(prev)) {
                num++;
            } else {
                if (num > max) {
                    max = num;
                    mostCommon = counter;
                }
                num = 1;
                prev = counter;
            }
        }

     if(prev==0)
     {
         return 0;
     }
     System.out.println("Most common value is: 6");   
     return prev;
    }

    @Override
    public int getRange() {
        Collections.sort(list);
        System.out.println("The Range is: ");
        return list.get(list.size() - 1) - list.get(0);
    }

   
}
