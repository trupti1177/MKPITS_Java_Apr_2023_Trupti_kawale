package AcceptFileName;

import java.io.*;

public class AcceptFileName {
    {
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name : ");

        try {
            String str2 = bufferedReader1.readLine();
            File file = new File(str2);
            if(file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String str = bufferedReader.readLine();
                while (str != null) {
                    System.out.println(str);
                    str = bufferedReader.readLine();
                }
            }else
                System.out.println("file does not exists");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}