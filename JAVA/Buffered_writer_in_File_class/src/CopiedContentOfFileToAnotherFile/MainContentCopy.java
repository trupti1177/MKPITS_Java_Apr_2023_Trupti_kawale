package CopiedContentOfFileToAnotherFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainContentCopy {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter source file name : ");
            String source = br.readLine();
            File file = new File(source);
            if(file.exists()) {
                System.out.println("Enter target file name : ");
                String targetFile = br.readLine();
                FileContentCopy.fileCopy(source,targetFile);
            }else
                System.out.println("File does not exists");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}