package ComparableInterface;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "ComparableInterface.Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }


    @Override
    public int compare(Student o1,Student o2) {
        if (o1.marks == o2.marks){
            return 0;
        } else if (o1.marks < o2.marks) {
            return -1;
        }else {
            return 1;
        }
    }
}