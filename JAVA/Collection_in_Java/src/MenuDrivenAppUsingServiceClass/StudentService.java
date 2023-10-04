package MenuDrivenAppUsingServiceClass;

import LinkListUsingStudentObject.Student;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentService {
    LinkedList<Student> linkedList=new LinkedList<>();
    Scanner scanner=new Scanner(System.in);

    public StudentService() {
        this.linkedList = new LinkedList<>();
    }

    public Student addRecord(Student student){
        linkedList.add(student);
        return student;
    }
    public void searchRecord(int index){
        System.out.println(linkedList.get(index));
    }
    public void displayRecord(){
        for(Student student:linkedList){
            System.out.println(student);
        }
    }
    public void modifyRecord(int indexModify, Student student){
        linkedList.set(indexModify,student);
    }
    public void deleteRecord(int index){
        System.out.println(linkedList.remove(index));

    }
    public void deleteAllRecord(){
        linkedList.clear();
    }
}