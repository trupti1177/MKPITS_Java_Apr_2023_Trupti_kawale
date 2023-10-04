package Test_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FindCharLineWord {
    public static void findNumberOfCharWordLines(){
        try {
            BufferedReader bufferedReader= new BufferedReader(new FileReader("nik.txt"));
            String str=bufferedReader.readLine();
            while (str!= null) {
                String[] arr=str.split(" ");
                for (int i = 0; i < arr.length; i++) {

                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}