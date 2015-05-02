package Task10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class StudentSort {
    public static void studentSort() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("", 6));
        list.add(new Student("", 6));
        list.add(new Student("", 4));
        list.add(new Student("", 5));
        list.add(new Student("", 6));
        list.add(new Student("Aaaaa",6));
        Collections.sort(list, GradeComparator.gradeComparator);
        System.out.println(list);

    }

    public static void main(String[] args) {
        StudentSort ss = new StudentSort();
        ss.studentSort();
    }

}
