package MenuDrivenAppUsingServiceClass;

import LinkListUsingStudentObject.Student;

import java.util.LinkedList;
import java.util.Scanner;

public class MenuDrivenAppUsingServiceClass {
    int choice;
    Scanner scanner = new Scanner(System.in);
    Student student;
    StudentService studentService=new StudentService();

    public void displayDetails() {

        while (true) {
            System.out.println("1 - Add Record ");
            System.out.println("2 - Display all Record ");
            System.out.println("3 - Find Record");
            System.out.println("4 - Modify Record");
            System.out.println("5 - Delete Record");
            System.out.println("6 - Delete all record");
            System.out.println("0 - Exit");
            System.out.println("Enter you choice (1/2/3/4/5/6/0) ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    student=new Student();
                    System.out.println("Enter name and marks :");
                    student.setName(scanner.next());
                    student.setMarks(scanner.nextInt());
                    System.out.println(studentService.addRecord(student));
                    break;
                case 2:
                    studentService.displayRecord();
                    break;
                case 3:
                    student = new Student();
                    System.out.println("Enter index to search student record : ");
                    int indexSearch = scanner.nextInt();
                    studentService.searchRecord(indexSearch);
                    break;
                case 4:
                    student = new Student();
                    System.out.println("Enter index number to modify record : ");
                    int indexValue = scanner.nextInt();
                    System.out.println("Enter new name and marks for modify record : ");
                    student.setName(scanner.next());
                    student.setMarks(scanner.nextInt());
                    studentService.modifyRecord(indexValue, student);
                    break;
                case 5:
                    System.out.println("Enter index number to delete student record : ");
                    int indexDelete = scanner.nextInt();
                    studentService.deleteRecord(indexDelete);
                    break;
                case 6:
                    studentService.deleteAllRecord();
                    System.out.println("All record deleted successfully");
                    break;
                case 0:
                    return;

            }
        }
    }
}