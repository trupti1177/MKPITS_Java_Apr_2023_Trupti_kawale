public class TimerPatternUsingNumberDown {
    public int starpattern(int number1) {
        for (int row = 1; row <= number1 - 1; row++) {
            for (int space = number1; space > row; space--) {
                System.out.print(" ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();

        }

        return 0;
    }

}