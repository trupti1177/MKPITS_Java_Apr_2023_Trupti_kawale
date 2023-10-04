package ReaderWriter;

import java.io.*;

public class ReaderWriterClass {
    public static void readWriteData(File file,String targetFileName) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            File file1 = new File(targetFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
            String str = bufferedReader.readLine();
            while (str != null) {
                bufferedWriter.write(str + "\n");
                str = bufferedReader.readLine();
            }
            bufferedWriter.close();
            System.out.println("File copied.");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}