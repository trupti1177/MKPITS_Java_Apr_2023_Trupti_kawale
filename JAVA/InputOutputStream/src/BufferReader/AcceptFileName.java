package BufferReader;

import java.io.*;

public class AcceptFileName {

    //  public static void displayData()
    { //By default { ----code over here--- },This means the default constructor bcoz FileReader constructor throws an error.
        BufferedReader bufferedReader1=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the file :");

        try {
            String string1= bufferedReader1.readLine();
            File file=new File(string1);
            if(file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String string = bufferedReader.readLine();

                while (string!= null) {
                    System.out.println(string);
                    string = bufferedReader.readLine();
                }
            }else
                System.out.println("File does not exist.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}