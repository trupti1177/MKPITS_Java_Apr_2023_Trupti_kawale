package Listiterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<Integer>();
        number.add(52);
        number.add(43);
        number.add(65);
        number.add(24);

        ListIterator<Integer> num=number.listIterator();
        System.out.println("-------------forward traverse-------------");

        while(num.hasNext())
        {
            System.out.println(num.next());
        }
        System.out.println("-----------Reverse traverse----------------");
        while(num.hasPrevious())
        {
    
        }
            System.out.println(num.previous());
    }
}
