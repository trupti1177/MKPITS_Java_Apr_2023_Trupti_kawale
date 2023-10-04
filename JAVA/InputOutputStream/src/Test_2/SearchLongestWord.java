package Test_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchLongestWord {
    public static void searchLongestWordMethod(){

        try {
            BufferedReader bufferedReader= new BufferedReader(new FileReader("nik.txt"));
            String str=bufferedReader.readLine();

            int wordCounter=0;

            while (str!= null) {
                String[] arr=str.split(" ");
                wordCounter=wordCounter+ arr.length;

            }
            System.out.println(wordCounter);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}