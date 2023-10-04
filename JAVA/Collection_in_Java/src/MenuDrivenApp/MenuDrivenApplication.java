package MenuDrivenApp;

import LinkListUsingStudentObject.Student;

import java.util.LinkedList;
import java.util.Scanner;

public class MenuDrivenApplication {
    public void displayDetails() {
        LinkedList<Student> studentLinkedList = new LinkedList<Student>();
        Student student;
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true){
            System.out.println("1 - Add Record ");
            System.out.println("2 - Display all Record ");
            System.out.println("3 - Find Record");
            System.out.println("4 - Modify Record");
            System.out.println("3 - Delete Record");
            System.out.println("4 - Delete all record");
            System.out.println("0 - Exit");
            System.out.println("Enter you choice (1/2/3/4/5/6/0) ");
            choice = scanner.nextInt();
            switch (choice){
                case 1 :
                    student = new Student();
                    System.out.println("Add Student record name and marks ");
                    student.setName(scanner.next());
                    student.setMarks(scanner.nextInt());
                    studentLinkedList.add(student);
                    break;
                case 2 :
                    for(Student stud : studentLinkedList){
                        System.out.println(stud);
                    }
                    break;
                case 3:
                    if(studentLinkedList != null) {
                        System.out.println("Enter index number to find student record : ");
                        int indexSearch = scanner.nextInt();
                        System.out.println(studentLinkedList.get(indexSearch));
                    }else{
                        System.out.println("Record not found");
                    }
                    break;
                case 4:
                    student = new Student();
                    System.out.println("Enter index number to modify record : ");
                    int indexValue = scanner.nextInt();
                    System.out.println("Enter new name and marks for modify record : ");
                    student.setName(scanner.next());
                    student.setMarks(scanner.nextInt());
                    studentLinkedList.set(indexValue,student);
                    System.out.println("Modified record");
                    break;
                case 5 :
                    System.out.println("Enter record number to delete : ");
                    int recordNumber = scanner.nextInt();
                    Object deleteObject = studentLinkedList.remove(recordNumber);
                    System.out.println(deleteObject);
                    break;
                case 6 :
                    studentLinkedList.clear();
                    System.out.println("All record deleted successfully");
                    break;
                case 0 :
                    return;

            }
        }
    }
}