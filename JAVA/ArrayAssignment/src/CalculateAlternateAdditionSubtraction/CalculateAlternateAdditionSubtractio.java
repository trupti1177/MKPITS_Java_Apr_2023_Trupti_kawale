package CalculateAlternateAdditionSubtraction;

//create a class with a "CalculateAdditionSubtraction" by implements with A interface "CalculateAlternateAdditionSubstraction"
class CalculateAdditionSubtraction implements CalculateAlternateAdditionSubtraction {
    /**
     * This method is used to print sum of square of 4th element in an array
     * @override method - "CalculateAdditionSubtraction" from "CalculateAlternateAdditionSubtraction"
     * @array - Declared and initialized the array value upto 40 in the range between 1 to 1000
     * @param sum - create a sum variable and initialize it as zero value which store the final result of "CalculateAdditionSubtraction"
     * loop which take the initial value from 5th element to array length and update it with a five(5).
     * condition if the first 5th element is odd then it is positive otherwise negative value.
     * then print final sum
     * */
    public void CalculateAdditionSubtraction() {
        //-------------here I store the array length with random value upto 40
        int array[] = {1, 4, 5, 8, 47, 74, 96, 44, 83, 40, 923, 433, 843, 23, 223, 454, 45, 87, 98, 343, 233, 232, 32, 222, 234, 787, 12, 32, 34, 87, 123, 125, 365, 76, 84, 68, 54, 76, 90, 100};

        //------------declare sum and initialize as 0
        int sum = 0;

        //-------------here I run loop from 3 upto array length and update it with a 4 it means it take every 4th element of the array
        for (int counter = 4; counter <= array.length; counter = counter + 5) {

            //------------condition to take a even element as positive
            if (counter % 2 != 0) {
                //----------display sum of cube of every 5th element
                System.out.print(array[counter] + "*" + array[counter] + "*" + array[counter]);
                System.out.print(" + ");
                //sum of cube of every 5th element
                sum = sum + (array[counter] * array[counter] * array[counter]);

            } else {//---------else condition to take every odd element as positive
                //----------display sum of cube of every 5th element
                System.out.print(array[counter] + "*" + array[counter] + "*" + array[counter]);
                System.out.print(" - ");
                //substract the cube of every 5th element
                sum = sum - (array[counter] * array[counter] * array[counter]);
            }
        }
        //--------------print sum of cube of every 5th element in an array
        System.out.println(" = " + sum);

    }
}