package CalculatorUsingLamdaFunctions;


import java.net.CacheRequest;
import java.util.Scanner;

public class MainCal {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Addition  2.Subtraction  3.Multilication");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Calculation calculation = (((number1, number2) -> {
                    System.out.println(number1 + number2);
                }));
                System.out.println("------The additiom of two number is--------");
                calculation.CalArea1(12, 3);
                break;

            case 2:
                Calculation calculation1 = (((number1, number2) -> {
                    System.out.println(number1 - number2);
                }));
                System.out.println("------The subtraction of two number is--------");
                calculation1.CalArea1(12, 3);
                break;


            case 3:
                Calculation calculation2 = (((number1, number2) -> {
                    System.out.println(number1 * number2);
                }));
                System.out.println("------The multiplication of two number is--------");
                calculation2.CalArea1(12, 3);
                break;

        }

    }
}
