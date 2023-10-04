import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 10;
        while (num == 10) {

            System.out.println("             Star pattern Merge Right Angle and Inverted Right Angle               ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the pattern number-1  2  3  4  5  6  7  : ");
            int pattern = scanner.nextInt();
            System.out.println("Enter the number to get the PYRAMID pattern : ");
            int number = scanner.nextInt();

            ServiceStarPattern serviceStarPattern = new ServiceStarPattern();
            serviceStarPattern.serviceStarPattern(pattern, number);
            System.out.println("------------------------------------------------------------");
        }
    }
}