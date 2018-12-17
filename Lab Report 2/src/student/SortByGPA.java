package student;

import java.util.Comparator;

public class SortByGPA implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if ( s1.gpa < s2.gpa)
            return -1;
        else if ( s1.gpa == s2.gpa )
            return 0;
        else
            return 1;

    }
}
