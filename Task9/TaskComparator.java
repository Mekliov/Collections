package Task9;
import java.util.Comparator;

public class TaskComparator {
    public static Comparator<Task> comp = new Comparator<Task>() {
        @Override
        public int compare(Task o1, Task o2) {
           
            return o2.getPriority() - o1.getPriority();
        }
    };
}
