public class MeargeStarInvertedRightAngle extends MeargeStarRightAngle {
    public  int starpattern (int number1) {
        for (int row = 1; row <= number1; row++) {
            for (int column = number1; column >= row; column--) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        return 0;
    }
}