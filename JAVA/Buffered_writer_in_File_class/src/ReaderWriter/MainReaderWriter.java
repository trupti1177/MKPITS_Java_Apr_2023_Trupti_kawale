package ReaderWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainReaderWriter {
    public static void main(String[] args) {
        //Read from keyboard
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter source file name : ");
            String source = bufferedReader.readLine();
            File file = new File(source);
            if(file.exists()){
                System.out.println("Enter target file name : ");
                String file2 = bufferedReader.readLine();
                ReaderWriterClass.FileCopy(file,file2);  //calling user defined method
            }else
                System.out.println("File does not exists");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}