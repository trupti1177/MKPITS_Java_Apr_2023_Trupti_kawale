package Test_2;

import java.io.*;
public class WriteObjectReadObject {
//    public static void displayData(){

//        try {
////            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("nik123.txt", true)));
//            BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter("nik123.txt", true));
//
//            bufferedWriter.append("the text");
//            bufferedWriter.close();
//            BufferedReader bufferedReader=new BufferedReader(new FileReader("nik123.txt"));
//            String str=bufferedReader.readLine();
//            System.out.println("Existing + Additional data :");
//            while(str!=null) {
//                System.out.println(str +"\n");
//                str=bufferedReader.readLine();
//            }
//        } catch (IOException e) {
//            System.out.println(e);
//        }

    //        -----------------------------------------------------------------------------------------
    public static void displayData(){

        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter("nik123.txt", true));

            System.out.println("Enter the String to add :");
            String str=bufferedReader.readLine();
            while(str!=null) {
                System.out.println(str +"\n");
                str=bufferedReader.readLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}