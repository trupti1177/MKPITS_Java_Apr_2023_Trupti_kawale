import java.util.*;
public class MiddleDigitNumberExample2
{
    public static void main(String args[])
    {
        int num, n, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        n=sc.nextInt();

        num = Math.abs(n);

        for(int i = num; i != 0; i = i/10)
            count++;
        if(count % 2 == 1)
        {
            for(int i = 1; i <= count / 2; i++)
            {
                num = num/10;
            }
            int mid = num % 10;

            System.out.println("Middle number is: " + mid);
        }

        else
        {
            for(int i = 1; i < count / 2; i++)
            {
                num = num/10;
            }
            int mid = num % 100;

            System.out.println("Middle number: " + mid);
        }
    }
}