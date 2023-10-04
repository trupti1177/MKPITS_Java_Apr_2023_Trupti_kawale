package LinkList;

import java.util.LinkedList;
import java.util.Scanner;

public class UserInputLinkList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of element add in Link list : ");
        int number = scanner.nextInt();
        for(int counter=0; counter<number; counter++){
            linkedList.add(scanner.nextInt());
        }
        System.out.println(linkedList);

    }
}