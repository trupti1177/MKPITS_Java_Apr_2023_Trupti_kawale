public class SumOfEveryFourthNumber implements OperationOfAdditionOfSquareOfEveryFourthNumber {
    @Override
    public void calculatesquareOfAddition(){
        System.out.println("The Addition Of Square Of Every Fourth Element In The Given Array List Is :  ");

        int array[] = {2, 3, 45, 6, 2, 5, 7,3,4,5,23,255,15,45,54,15,20,45,12,14,58,45,55,88,99,77,44,5,69,1,47,85,65,45,45,85,23,56,69,40};
        int addition= 0;

        for (int element = 3; element< array.length; element+= 4) {

            System.out.print(array[element]+  "*"  +array[element]);
            System.out.print( " + " );
            addition+= array[element] * array[element];
        }

        System.out.println("Addition Of Every Fourth Number is =  " + addition);
    }
}

