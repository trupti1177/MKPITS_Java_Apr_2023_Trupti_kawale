public class MeargeStarRightAngle {
    public  int starpattern (int number1) {

        for (int row = 0; row <= number1; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        return 0;
    }
}