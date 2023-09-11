import java.util.Scanner;



public class TwoDimensionalArrayUsingPatternFirst {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int rows=sc.nextInt();
        int cols= sc.nextInt();
        int [][] numbers=new int [rows] [cols];

        for(int outerloop=0;outerloop<rows;outerloop++){
            for(int innerloop=0;innerloop<cols;innerloop++){
                numbers[outerloop][innerloop] = sc.nextInt();
            }
        }
        int x= sc.nextInt();
        for(int outerloop=0;outerloop<rows;outerloop++){
            for(int innerloop=0;innerloop<cols;innerloop++){
                if(numbers[outerloop][innerloop] == x){
                    System.out.println("x found at location (" +outerloop+" ,"  +innerloop+ " )" );
                }
            }
        }



    }

}