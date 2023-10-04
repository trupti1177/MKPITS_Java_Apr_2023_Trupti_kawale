package mathclassoperation;

import java.util.Scanner;

public class BinaryEquivalent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int n=sc.nextInt();
        System.out.println("Binary Equivalent of "+n+" = "+Integer.toBinaryString(n));
        System.out.println("Octal Equivalent of "+n+" = "+Integer.toOctalString(n));
        System.out.println("Hex Equivalent of "+n+" = "+Integer.toHexString(n));

    }
}
