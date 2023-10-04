package ComparableInterface;

import java.util.Arrays;

import java.util.Collections;
import java.util.LinkedList;

public class ComparableInterface {
    public static void useOfComparableInterface(){
        LinkedList<Student> linkedList = new LinkedList<Student>();
        Student[] students = new Student[4];
        students[0] = new Student("Shivam",90);
        students[1] = new Student("Aniket",85);
        students[2] = new Student("pranay",95);
        students[3] = new Student("mohit",65);
        linkedList.addAll(Arrays.asList(students));

//=============================== Sort By Name ======================================================//
        System.out.println("=============================== Sort By Name =============================================");
        Collections.sort(linkedList,new SortedName());
        for(int number=0; number<linkedList.size(); number++){
            System.out.println(linkedList.get(number));
        }

//============================== Sort By Marks =============================================//
        System.out.println("============================== Sort By Marks =============================================");
        Collections.sort(linkedList,new SortedMarks());
        for(Student student : linkedList){
            System.out.println(student);
        }

    }
}