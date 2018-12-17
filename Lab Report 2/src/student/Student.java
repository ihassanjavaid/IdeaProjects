package student;

import java.util.Comparator;

public class Student /*implements Comparable*/ {
    protected String regNo;
    protected String name;
    protected double gpa;

    public Student(String reg, String nam, double gp){
        setValues(reg, nam, gp);
    }

    public void setValues(String reg, String nam, double gp){
        this.regNo = reg;
        this.name = nam;
        this.gpa = gp;
    }

    /*
    @Override
    public int compareTo(Object obj) {
        student.Student s = (student.Student) obj;


        if ( this.gpa < s.gpa )
            return -1;
        else if ( this.gpa == s.gpa )
            return 0;
        else
            return 1;
    }
    */

    public void display(){
        System.out.println(regNo+": "+name+" , "+gpa+".");
    }

    /*
    @Override
    public int compareTo(Object o) {
        student.Student s = (student.Student) o;
        return this.regNo.compareTo(s.regNo);
    }
    */

}
