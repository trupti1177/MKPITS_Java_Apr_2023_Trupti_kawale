package ReaderWriter;
import java.io.*;

public class ReaderWriterClass {
    public static void FileCopy(File file, String fname2){

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            File file1=new File(fname2);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
            String str = bufferedReader.readLine();
            while(str!=null){
                bufferedWriter.write(str + "\n");
                str = bufferedReader.readLine();
            }
            bufferedWriter.close();
            System.out.println("copied filed");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}