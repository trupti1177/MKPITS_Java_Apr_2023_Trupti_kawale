package Test_2;

import java.io.*;

public class TextFileArrayLineByLine {
    //  public static void displayArrayDataLineByLine(){
//--------------------------------- First code -------------------------------------------------------
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("nik.txt"));
//            String str;
//            while ((str = bufferedReader.readLine()) != null) {
//                String[] arr=new String[str.length()];
//                for (int i = 0; i < str.length(); i++) {
//                    arr[i] = bufferedReader.readLine();
//                }
//                for(String value:arr){
//                    System.out.println(value);
//                }
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//      ------------------------------- Second code ---------------------------------------------------
    public static void displayArrayDataLineByLine(String arrayValue){

        String[] arr=new String[Integer.parseInt(arrayValue)];
        try {
            int number=0;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("nik.txt"));
            String str=bufferedReader.readLine();
            while (str != null) {
                arr[number] = str;
                str=bufferedReader.readLine();
                number++;
            }
            for(String value:arr){
                System.out.println(value);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}