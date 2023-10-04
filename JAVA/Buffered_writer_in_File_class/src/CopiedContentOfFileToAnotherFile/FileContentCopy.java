package CopiedContentOfFileToAnotherFile;

import java.io.*;

public class FileContentCopy {
    public static void fileCopy(String file1, String file2) throws IOException, FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
        String str = bufferedReader.readLine();
        while (str != null) {
            bufferedWriter.write(str + "\n");
            str = bufferedReader.readLine();
        }
        bufferedWriter.close();
        System.out.println("File copied...");
    }
}