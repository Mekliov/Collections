package Task10;
import java.util.Comparator;
public class GradeComparator  {

 
    public static Comparator<Student> gradeComparator = new Comparator<Student>() {
      
        @Override
        public int compare(Student o1, Student o2) {
            if(o2.getGrade()==o1.getGrade())
            {
                return o1.getName().compareTo(o2.getName());
            }
            return o2.getGrade()-o1.getGrade();
        }
    };
    
}
