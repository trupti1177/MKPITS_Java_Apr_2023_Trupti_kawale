package BufferReader;

import java.io.*;

public class ReadDataFromFile {
    {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("abc.text"));
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