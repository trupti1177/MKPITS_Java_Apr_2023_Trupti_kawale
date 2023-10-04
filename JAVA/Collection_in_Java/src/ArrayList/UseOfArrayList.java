package ArrayList;

import java.util.*;

public class UseOfArrayList {
    public static void main(String[] args) {
        int[] array = {23,43,123,545,126,879};

        //We can specify here particular dataType value here
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(199);
        list1.add(200);
        list1.add(98);
        list1.add(87);
        list1.add(100);
        list1.add(110);
        System.out.println("Arraylist in integer format = "+list1);

//------------------------------------------------------------------------------------------------------------//

        List list = new ArrayList();

//--------------------------------- add() --> Append element to the end of the list --------------------------//
        list.add(56);
        list.add(23.56);
        list.add("shubham");
        list.add('x');
        System.out.println("Using object name = " + list);

//------------------------------------------------------------------------------------------------------------//
        System.out.print("--------------- Using for loop --------------------");
        for(int numberElement=0; numberElement<list.size(); numberElement++){
            System.out.println(list.get(numberElement));
        }

//-----------------------------------------------------------------------------------------------------------//
        System.out.println("-------------- Using Iterator ----------------");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//----------------------------------------------------------------------------------------------------------//
        list.add(2,78);
        System.out.println("add(int index,Object element) -> Add element to particular index = " + list);

//----------------------------------------------------------------------------------------------------------//
        System.out.println("contains(Object o) -> Return true if element is present = "+list.contains("shubham"));

//----------------------------------------------------------------------------------------------------------//
        System.out.println("indexOf(Object o) -> Return index of specified element if it is not present it will print (-1) = "+list.indexOf(78));

//----------------------------------------------------------------------------------------------------------//
        System.out.println("isEmpty() -> Return true if this list contains no elements = " + list.isEmpty());

//----------------------------------------------------------------------------------------------------------//
        System.out.println("remove(int index) -> remove element from specified position in the list = " + list.remove(4));

//----------------------------------------------------------------------------------------------------------//
        System.out.println("lastIndexOf(Object o) -> Return index of last element in the list, if it is not exist it will print (-1) = "+list.lastIndexOf('x'));

//----------------------------------------------------------------------------------------------------------//
        System.out.println(list.listIterator(2));

//----------------------------------------------------------------------------------------------------------//
        System.out.println("size() -> Number of element present in list = " + list.size());

//----------------------------------------------------------------------------------------------------------//
        System.out.println("Before replace = "+list);
        System.out.println("Replace element at specific position in the list = "+list.set(1,80.90));
        System.out.println("After replace = "+list);

//----------------------------------------------------------------------------------------------------------//
        System.out.println("compare to object values using equals() method = "+list.equals(list1));

//----------------------------------------------------------------------------------------------------------//
        //This method takes the index of first element as parameter to be returned from listIterator
        //Return Value: This method returns a list iterator over the elements in this list (in proper sequence),
        //starting at the specified position in the list.
        ListIterator<Integer> listIterator = list1.listIterator(2);
        System.out.print("listIterator() method = ");
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

//------------------------------------ asList() -------------------------------------------------------------//
        //asList() -> it takes multiple values but return only fixed size of array
        List newlist = Arrays.asList(12,433,545,123,343);//It creates a fixed size of list
        System.out.println("asList() method = "+newlist);

//------------------------------------ addAll() -------------------------------------------------------------//
        List list2 = new ArrayList();
        list2.add(120);
        list2.add(76);
        list2.add(34);
        System.out.println("addAll() method = "+list.addAll(list2));

//---------------------------------- trimToSize() ----------------------------------------------------------//

    }
}