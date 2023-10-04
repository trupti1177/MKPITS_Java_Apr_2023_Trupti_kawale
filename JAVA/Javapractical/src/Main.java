import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student>data=new LinkedList<Student>();
        Student[] s=new Student[4];
        s[0]=new Student(90,"Trupti");
        s[1]=new Student(92,"Mrunali");
        s[2]=new Student(43,"Pradnya");
        s[3]=new Student(67,"Swati");
        data.addAll(Arrays.asList(s));
        Collections.sort(data,new Marks());

        for (Student p:data
        ){
            System.out.println(p.getMarks()+"  "+p.getName());
        }
        Collections.sort(data,new Name());

        for (Student p:data
        ){
            System.out.println(p.getMarks()+"  "+p.getName());
        }


    }
}