package BufferReader;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyBufferReaderClass {
    public static void displayData() throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        System.out.println("Enter the name :");

        String string=bufferedReader.readLine();
        System.out.println("My name is "+string);

        System.out.println("enter the number :");
        String result=bufferedReader.readLine();
//  ------we can directly access the parseInt() by import the package (import static java.lang.Integer.*;)
//        we can import any static class over here
        System.out.println("Result = "+Integer.parseInt(result)*Integer.parseInt( result));

        System.out.println("Enter a number :");
        int number=Integer.parseInt(bufferedReader.readLine());
        if(number%2==0){
            System.out.println("Even number :"+number);
        }else {
            System.out.println("Odd number :"+number);
        }
    }
}