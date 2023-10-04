package TryCatchFinally;

import java.util.Arrays;

public class ArrayProgram {
    private static int[] array = {1, 5, 10, 15, 20};

    public static void displayArrayData() {
        try {
            for (int startLoop = 0; startLoop < array.length; startLoop++) {
//            System.out.println(Arrays.toString(array));
                System.out.println(array[startLoop]);
            }
        }
        catch (ArithmeticException e){
            System.out.println("Arithmatic exception.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("End of the program");
        }
    }
}