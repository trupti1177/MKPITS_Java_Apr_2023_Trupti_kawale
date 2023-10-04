package FileReaderAndWriter;

import java.io.*;
import java.io.FileWriter;
import java.nio.Buffer;

public class FileReaderWriter {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("xyz.txt"));
        System.out.println("Enter the names : ");
        String str1 = bufferedReader.readLine();
        bufferedWriter.write(str1);
        bufferedWriter.close();

    }
}