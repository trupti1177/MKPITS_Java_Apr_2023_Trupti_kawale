package LinkList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseOfLinkList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(23);
        linkedList.add("Neha");
        linkedList.add("Pranay");
        linkedList.add(23);
        linkedList.add(87);
        linkedList.add("Abhishek");
        linkedList.add("Teju");
        linkedList.add(90);
        linkedList.add(65);
        linkedList.add(87);
        System.out.print("Display list using LinkList = ");
        System.out.println(linkedList);

//--------------------------------------------- Using for Loop -------------------------------------------------------//
        System.out.println("------------------------- Using for loop ----------------------------------");
        System.out.print("Using for loop = ");
        for(int counter=0; counter<linkedList.size(); counter++){
            System.out.print(linkedList.get(counter) + " ");
        }
        System.out.println();

//------------------------------------------- Using for Each Loop ----------------------------------------------------//
        System.out.println("----------------------------- Using forEach loop ----------------------------");
        System.out.print("Using for each loop = ");
        for(Object object:linkedList){
            System.out.print(object + " ");
        }
        System.out.println();

//------------------------------------------- Using Iterator ---------------------------------------------------------//
        System.out.println("--------------------------- Using Iterator ---------------------------------");
        System.out.print("Using Iterator = ");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

//------------------------------------------- addFirst() method ------------------------------------------------------//
        System.out.println("------------------------------ addFirst() method -----------------------------------");
        System.out.print("addFirst() method -> add element the the first place = ");
        linkedList.addFirst("shubham");
        for (Object object1 : linkedList){
            System.out.print(object1 + "  ");
        }
        System.out.println();

//----------------------------------------- addLast() method ---------------------------------------------------------//
        System.out.println("------------------------------ addLast() method ------------------------------------");
        System.out.print("addFirst() method -> add element the the last place = ");
        linkedList.addLast("pradnya");
        for (Object object1 : linkedList){
            System.out.print(object1 + "  ");
        }
        System.out.println();

//--------------------------------------- indexOf() method -----------------------------------------------------------//
        System.out.println("-------------------------------- indexOf() method -------------------------------");
        System.out.print("indexOf() -> it return position number first occurrence value(if we have same value in linkList) = ");
        System.out.print(linkedList.indexOf(23));
        System.out.println();

//--------------------------------------- lastIndexOf() method -----------------------------------------------------------//
        System.out.println("------------------------------- lastIndexOf() method ---------------------------------");
        System.out.print("lastIndexOf() -> it return position number of first occurrence value(if we have same value in linkList) = ");
        System.out.print(linkedList.lastIndexOf(87));
        System.out.println();

//--------------------------------------- contains() method -------------------------------------------------------------//
        System.out.println("----------------------- contains() method -------------------------");
        System.out.println("It return true if specified value is present in linklist = "+linkedList.contains("Neha"));

//--------------------------------------- addAll() method ---------------------------------------------------------------//
        System.out.println("------------------------ addAll() method ----------------------------");
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(3);
        linkedList1.add(40);
        linkedList.addAll(linkedList1);
        System.out.println(linkedList);

//--------------------------------------- offer, offerFirst(), offerLast() method ---------------------------------------//
        System.out.println("------------------------ offer() method ----------------------------");
        System.out.println("offer() -> add element to the last = "+linkedList.offer(88));
        System.out.println("offerFirst() -> add element to first position = "+linkedList.offerFirst(2));
        System.out.println("offerLast() -> add element to last position = "+linkedList.offerLast(5));
        System.out.println("Check whether offer apply or not = " + linkedList);

//-------------------------------------- peek(), firstPeek(), lastPeek() ------------------------------------------------//
        System.out.println("----------------------- peek(), peekFirst(), peekLast() --------------------------");
        System.out.println(linkedList.peek());
        System.out.println("Retrieves, but does not remove, the head (first element) of this list using peek() = "+linkedList);
        System.out.println("Retrieves first element, but does not remove using peekFirst() = "+linkedList.peekFirst());
        System.out.println("Retrieves last element, but does not remove using peekLast() = "+linkedList.peekLast());
        System.out.println(linkedList);

//-------------------------------------- peek(), firstPeek(), lastPeek() -----------------------------------------------//
        System.out.println("----------------------- poll(), pollFirst(), pollLast() --------------------------");
        System.out.println(linkedList.poll());
        System.out.println("Retrieve and remove first element from  poll() = "+linkedList);
        System.out.println("Retrieves first element and remove using pollFirst() = "+linkedList.pollFirst());
        System.out.println("Retrieves last element and remove using pollLast() = "+linkedList.pollLast());
        System.out.println(linkedList);

//------------------------------------ pop(), push() -------------------------------------------------------------------//
        System.out.println("remove first element of linkedList using pop() = "+linkedList.pop());
        System.out.println(linkedList);
        linkedList.push("aniket");
        System.out.println("add element to the linkedList using push() = "+linkedList);

//----------------------------------- remove(), remove(int index) -------------------------------------------------------------------------//
        System.out.println("remove first element from linkList = "+linkedList.remove());
        System.out.println(linkedList);
        System.out.println("remove element from particular index using remove(int index) = " + linkedList.remove(1));
        System.out.println(linkedList);
        System.out.println("remove object element using remove(object o) = " +linkedList.remove(linkedList));
        System.out.println(linkedList);
        System.out.println("remove first element from linkList using remove(int index, element) = " + linkedList.removeFirst());
        System.out.println(linkedList);
        System.out.println("remove last element from linkList using remove(int index, element) = " + linkedList.removeLast());
        System.out.println(linkedList);

//------------------------------- set(int index, element e) -------------------------------------------------------------------------------//
    }
}