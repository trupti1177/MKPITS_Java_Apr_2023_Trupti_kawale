import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shapes s;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter case : ");
        int option  = scanner.nextInt();

        switch (option){

            case 1:{
            System.out.print("Enter radius : ");
            int r=scanner.nextInt();
            AreaOFCircle areaOFCircle = new AreaOFCircle(r);
            areaOFCircle.FindArea();


            }
            case 2: {
                System.out.print("Enter side of square : ");
                int s = scanner.nextInt();
                Square square = new Square(s);
                square.FindArea();
            }
            case 3: {
                System.out.print("Enter height : ");
                int length = scanner.nextInt();
                System.out.println("Enter breadth of circle");
                int breadth = scanner.nextInt();
                AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
                areaOfRectangle setBreadth(breadth);
                areaOfRectangle.setLength(length);
                areaOfRectangle.findArea();


            }


            }
        }


    }