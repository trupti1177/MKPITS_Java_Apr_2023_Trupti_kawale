import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice your Calculation option");
        int option = scanner.nextInt();
        Calculation calculation;
        System.out.println("Enter first number");
        int a= scanner.nextInt();

        System.out.println("Enter Second Number");
        int b = scanner.nextInt();

        switch (option){

            case 1:
                calculation=new Addition();
                int x =calculation.calculationNumber(a,b);
                System.out.print("Addition of two number"+x);
                break;

            case 2:
                calculation=new Substraction() ;
                int y =calculation.calculationNumber(a,b);
                System.out.print("Addition of two number :"+y);
                break;
            case 3:
                calculation=new Multiplication();
                int s =calculation.calculationNumber(a,b);
                System.out.print("Addition of two number :"+s);
                break;
            case 4:
                calculation=new Division();
                int t =calculation.calculationNumber(a,b);
                System.out.println("Division of two number :"+t);
                break;
            default:
                System.out.println("Expression not found");


        }
    }
}