package Test_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirstThreeLine {
    public static void displayFirstThreeLine(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("nik.txt"));
            String lineRead=null;
            for(int i=0;i<3;i++) {
                lineRead = bufferedReader.readLine();
                System.out.println("First three lines : " + lineRead);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}