import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //User input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        double operand1 = scanner.nextDouble();

        System.out.println("Enter your Second number : ");
        double operand2 = scanner.nextDouble();

        System.out.println("Enter operator +, -, *, /, % : ");
        String operator = scanner.next();
        System.out.println(""+operand1+" "+operator+" "+operand2+" = ");



        //created calculator service object
        CalculatorService calculatorService = new CalculatorService();

        System.out.println(calculatorService.Calculate(operator,operand1,operand2));

    }
}