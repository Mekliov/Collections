package Task9;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ToDoList {
    List<Task> task = new ArrayList<Task>();;
    int time = 0;

    public ToDoList(Integer time) {
        this.time = time;
        if (this.time == 0) {
            Random rd = new Random(7);
            time = rd.nextInt();
        }

    }

    void add(Task t) {
        task.add(t);
        Collections.sort(task, TaskComparator.comp);
    }

    void markFinished(Task t) {
        if(task.contains(t))
        {
            task.remove(t);
        }
        System.out.println("Excelent");
    }

    void markCancelled(Task t) {
        if(task.contains(t))
        {
            task.remove(t);
        }
        
       
    }

    public Object getTop() throws NoSuchFieldException, SecurityException {

        Object obj = task.get(0).getClass().getSimpleName();
        return obj;
    }

    boolean canFinish() {

        return true;
    }

    Object getRemainigTime() {
        int res = 0;
        for (int i = 0; i < task.size(); i++) {
            res += task.get(i).time;
        }
        if (res > this.time) {
            System.out.println("The time for your task is bigger than time in your list!");
            System.out.println("Now they are equals!!!");
            this.time= res;
        }
        return res;
    }

   
}
