package HashMapCityChoice;

import java.util.Scanner;

public class City {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("1.Add city"+"\n"+"2.display all"+"\n"+"3.Find"+"\n"+"4.Delete"+"\n"+"5.Replace"+"\n"+"6.Clear all"+"\n"+"7.Exit"+"\n");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Add keys (city code) and values(city name) : ");
                    break;

                case 2:
                    System.out.println("Add keys (city code) and values(city name) : ");
                    break;
            }
        }
    }
}
