public class AdditionSubtractionOfEveryFifthNumberCube implements OperationOfAlternateAdditionAndSubtraction {
    @Override
    public void calculateOperation() { //this calculateOperation Method use to calculate the opeartion.
        System.out.println("The Addition Of Square Of Every Fourth Element In The Given Array List Is :  ");//here we print the statement to know what operation we are performing

        int array[] = {2, 3, 45, 6, 2, 5, 7, 3, 4, 5, 23, 255, 15, 45, 54, 15, 20, 45, 12, 14, 58, 45, 55, 88, 99, 77, 44, 5, 69, 1, 47, 85, 65, 45, 45, 85, 23, 56, 69, 40};

        int addition = 0;

        System.out.print(" The Addition And Subtraction Of Every Fourth Number  and cube of that fifth number is =  " + addition);

        for (int element = 4; element < array.length; element += 5) {

            if (element % 2 != 0) {

                System.out.print(array[element] + "*" + array[element] + "*" + array[element]);
                System.out.print(" + ");
                addition += addition + (array[element] * array[element] * array[element]);


            } else {

                System.out.print(array[element] + "*" + array[element] + "*" + array[element]);
                System.out.print(" - ");
                addition += addition - (array[element] * array[element] * array[element]);
            }


        }
    }
}
