public class TimerShapePyramid {
    public  int starpattern (int number1){

        for(int row = 1; row <= number1; row++)
        {
            for(int space=1;space<row;space++){
                System.out.print(" ");
            }
            for(int column = 0;column<= number1-row;column++)
            {
                System.out.print( "* ");
            }
            System.out.println();

        }
        return 0;


    }
}