import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numberArray = {78, 34, 12, 32, 24, 56, 98, 14};
        char[] charCharacter = {'z', 'e', 'r', 'b', 'u'};
        Arrays.sort(numberArray);

//------------------------------------- binarySearch() method print index of integer value ------------------------------------------------------//
        System.out.println("Display index value of Integer type array using binarySearch() method = " + Arrays.binarySearch(numberArray, 34));
        Arrays.sort(charCharacter);

//------------------------------------- binarySearch() method print index of character --------------------------------------------//
        System.out.println("Display index value of character type array using binarySearch() method = " + Arrays.binarySearch(charCharacter, 'e'));

//------------------------------------- copyOf() method print new length of array and store new value as 0 --------------------------------------//
        int[] newArray = Arrays.copyOf(numberArray, 10);
        System.out.print("display new element in array using copyOf() method = ");
        for (int counter : newArray) {
            System.out.print(counter + " ");
        }
        System.out.println();

//------------------------------------- copyOf() method and display array element in string format using toString() method ------------------------//
        System.out.println("copyOf() method which return string value using toString method = " + Arrays.toString(Arrays.copyOf(numberArray, 8)));


//------------------------------------ copyRangeOf(int[] original, int from, int to) -> copy range of specified array into new array ------------------------//
        int[] arr = {17, 32, 44, 99, 29, 22, 5, 18, 51, 66, 12, 14, 57};
        Arrays.sort(newArray);
        System.out.println("copy range of specified array into new array = ");
        int[] newArray1 = Arrays.copyOfRange(arr, 1, 4);
        for (int number : arr) {
            System.out.print(number);
        }

//---------------------------------- deepEquals(Object[] a1, Object[] a2) -> Returns true if the two specified arrays are deeply equal to one another -----------//
        int array1[][] = {
                { 5, 2 },
                { 9, 12 },
                { 9, 1 } };
        int array2[][] = {
                { 47, 8 },
                { 12, 50 },
                { 13, 14 } };
        System.out.println("comparing two dimensional array using deepEquals() = "+Arrays.deepEquals(array1,array2));

//-------------------------------- equal() -> compare one dimensional array and return true if it is equals -------------------------------------------//
        System.out.println("comparing one dimensional array using equals() = " + Arrays.equals(numberArray,arr));

//------------------------------- fill() -> fill value in the array -----------------------------------------------------------------------------------//
        Arrays.fill(numberArray,89);
        System.out.println(Arrays.toString(numberArray));

//------------------------------ hashcode() -> Returns a hash code based on the contents of the specified array --------------------------------------//
        System.out.println("hashcode of single dimensional array = " + numberArray.hashCode());

//--------------------------------- parallelSort() -> Sorts the specified array into ascending numerical order --------------------------------------//
        int arr1[] = {1, 46, 165, 6, 78, 6, 65, 955, 4, 5, 323, 256, 5, 99, 22, 33};
        Arrays.parallelSort(arr1);
        System.out.println("Sorts the specified array into ascending numerical order using parallel() = ");
        for(int number1 : arr1) {
            System.out.print(number1 + " ");

        }
        System.out.println();

//--------------------------------- setAll() -> it generate the square of index ---------------------------------------------------------------------//
        int[] array3 = new int[10];
        Arrays.setAll(array3, (index) -> index*index);
        System.out.println("Generates square of index in an array using setAll(int[] arr, (index) -> index*index = "+Arrays.toString(array3));




    }
}}