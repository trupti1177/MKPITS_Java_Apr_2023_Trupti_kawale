package BufferReader;

import java.io.*;

public class AcceptFileNameFromUser {
    {
        BufferedReader bufferedReader1=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the file :");

        try {
            String string1= bufferedReader1.readLine();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(string1));
            String string= bufferedReader.readLine();
            while(string!=null) {
                System.out.println(string);
                string= bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}