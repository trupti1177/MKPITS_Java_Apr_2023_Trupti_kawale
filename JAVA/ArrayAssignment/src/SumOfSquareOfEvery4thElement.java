//-----------implement class by interface
public class SumOfSquareOfEvery4thElement implements CalculateSumOfSquareOfElement {
    //------------declare method of interface
    public void SumOfSquareOfEvery4thElement() {
        //-------------here I store the array length with random value upto 40
        int array[] = {1, 4, 5,  8, 47, 74, 96, 44, 83, 40, 923, 433, 843, 23, 223, 454, 45, 87, 98, 343, 233, 232, 32, 222, 234, 787, 12, 32, 34, 87, 123, 125, 365, 76, 84, 68, 54, 76, 90, 100};
        //------------declare sum and initialize as 0
        int sum = 0;
        //-------------here I run loop from 3 upto array length and update it with a 4 it means it take every 4th element of the array
        for(int counter = 3; counter <= array.length; counter=counter+4){
            //------------here practically show that how it squared every 4th element and add
            System.out.print(array[counter]  + "*" + array[counter] + " ");
            //------------here I take a operator (+) with add every square value and print addition
            System.out.print("+" + " ");
            //------------store sum in sum variable and print final addition
            sum = sum + (array[counter]*array[counter]);

        }
        //--------------print sum of square of every 4th element
        System.out.println(" = " + sum);

    }
}