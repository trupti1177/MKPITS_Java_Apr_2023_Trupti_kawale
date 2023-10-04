import LinkLinkUsingStudentObject.Student;

import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        String name, choice;
        int marks;
        do {
            System.out.println("Enter student name and marks here");
            name=scanner.next();
            marks= scanner.nextInt();
            linkedList.add(new Student(name,marks));

            System.out.println("Do you want to add another record (Yes/No) ");
            choice=scanner.next();

        }while (choice.equalsIgnoreCase("yes"));

        for(Student object : linkedList){
            System.out.println(object + " ");
        }

    }
}