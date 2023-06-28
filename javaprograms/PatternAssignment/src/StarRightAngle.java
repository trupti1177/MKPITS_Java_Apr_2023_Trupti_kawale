import java.util.Scanner;
public class StarRightAngle {
    public int starpattern (int number1){
        for(int defaultNumber=0;defaultNumber<=number1;defaultNumber++){
            for(int number2=0;number2<defaultNumber;number2++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        return 0;
    }
}