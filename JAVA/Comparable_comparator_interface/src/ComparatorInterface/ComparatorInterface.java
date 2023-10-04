package ComparatorInterface;

import java.util.*;

public class ComparatorInterface{
    public static void useOfComparatorInterface(){
        ArrayList<StudentComparator> arrayList = new ArrayList<StudentComparator>();
        StudentComparator[] students = new StudentComparator[4];
        students[0] = new StudentComparator("Shivam",90);
        students[1] = new StudentComparator("Aniket",85);
        students[2] = new StudentComparator("pranay",95);
        students[3] = new StudentComparator("mohit",65);

        System.out.println("============================== Sort by marks ====================================");
        arrayList.addAll(Arrays.asList(students));
        Collections.sort(arrayList,new SortMarks());
        for(StudentComparator studentComparator : arrayList){
            System.out.println(studentComparator);
        }


        System.out.println("============================== Sort by name =====================================");
        Collections.sort(arrayList,new SortName());
        for(StudentComparator studentComparator1 : arrayList){
            System.out.println(studentComparator1);
        }


    }
}