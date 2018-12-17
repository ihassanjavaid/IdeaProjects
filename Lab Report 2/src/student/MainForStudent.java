package student;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainForStudent {
    public static void main(String[] args) {
        Student s1 = new Student("01", "Ali", 4.0);
        Student s2 = new Student("03", "Ahmed", 2.0);
        Student s3 = new Student("02", "Zahid", 3.0);

        List list = new LinkedList();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list, new SortByGPA());


        for ( int i = 0 ; i < list.size() ; i++ ) {
            Student stu = (Student) list.get(i);
            stu.display();
        }
    }
}
