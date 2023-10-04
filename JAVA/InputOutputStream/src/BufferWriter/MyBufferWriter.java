package BufferWriter;

import java.io.*;

public class MyBufferWriter {
//    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
//    {
//        try {
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("abc.text"));
//            System.out.println("Enetr the name :");
//            String read = bufferedReader.readLine();
//            while (true) {
//                if (read.equals("end"))
//                    break;
//                bufferedWriter.write(read+"\n");
//                read = bufferedReader.readLine();
//            }
//                bufferedWriter.close();
//
//            } catch(IOException e){
//                throw new RuntimeException(e);
//            }
//    }

    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    {
        try {
            System.out.println("enter file name :");
            String str= bufferedReader.readLine();
            File file=new File(str);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            System.out.println("Enetr the name :");
            String read = bufferedReader.readLine();
            while (true) {
                if (read.equals("end"))
                    break;
                bufferedWriter.write(read+"\n");
                read = bufferedReader.readLine();
            }
            bufferedWriter.close();

        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}