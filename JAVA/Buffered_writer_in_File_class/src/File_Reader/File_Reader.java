package File_Reader;
import java.io.*;

public class File_Reader {
    public static void main(String[] args) {
//==================================== It read or (print) only first name of the file =============================//
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("abc.txt"));
            String str = bufferedReader.readLine();
            System.out.println(str);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//===================================== It read or (print) all name from the file ================================//
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("abc.txt"));
//            String str = bufferedReader.readLine();
//            while(str != null){
//                System.out.println(str);
//                str = bufferedReader.readLine();
//            }
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//====================================== Taking input file from user and read it ==================================//

//        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter file name : ");
//
//        try {
//            String str2 = bufferedReader1.readLine();
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(str2));
//            String str = bufferedReader.readLine();
//            while(str != null){
//                System.out.println(str);
//                str = bufferedReader.readLine();
//            }
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//========================= Taking user input file and also check whether file exists or not ===================//
//        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter file name : ");
//
//        try {
//            String str2 = bufferedReader1.readLine();
//            File file = new File(str2);
//            if(file.exists()) {
//                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//                String str = bufferedReader.readLine();
//                while (str != null) {
//                    System.out.println(str);
//                    str = bufferedReader.readLine();
//                }
//            }else
//                System.out.println("file does not exists");
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }
}