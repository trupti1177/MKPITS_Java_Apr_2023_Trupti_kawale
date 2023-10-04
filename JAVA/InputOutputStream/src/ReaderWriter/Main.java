
package ReaderWriter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("Abhi", 60);

//        ====================== Read Object without Return Type =========================

//        StudentObjectReadWrite.studentReadObject(student);

//        ====================== Read Object with Return Student class object =========================
//
//        student= StudentObjectReadWrite.studentReadObject(student);
//
//        System.out.println(student.getName()+" "+student.getMarks());

        //================== Read Object with Return Object class object =========================

        student=(Student) StudentObjectReadWrite.studentReadObject();
        System.out.println(student.getName()+" "+student.getMarks());

    }
}