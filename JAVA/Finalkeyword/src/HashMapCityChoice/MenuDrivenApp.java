package HashMapCityChoice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MenuDrivenApp {
    public static void displayDetailsOfHashmap() {
        HashMap<Integer,String> hashMap = new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        int choice;

        while(true){
            System.out.println("1-Add" + "\n" + "2-Display all" + "\n" + "3-Find" + "\n" + "4-Delete" + "\n" + "5-Replace" + "\n" + "6-Clear all" + "\n" + "7-Exit");
            System.out.println("Enter your choice ");
            switch (choice){
                case 1:
                    System.out.println("enter city code and city name");
                    hashMap.put(scanner.nextInt(),scanner.nextInt());
                    break;
                case 2:
                    Set set = hashMap.entrySet();
                    System.out.println("Display data");
                    System.out.println();
                    break;
                case 3:

            }
        }


    }
}
