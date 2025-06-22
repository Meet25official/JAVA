/*
Task:
Write a Java program to shuffle elements in a linked list.
Test Case: 
Linked list before shuffling:                                          
[Red, Green, Black, Pink, orange]                                      
Linked list after shuffling:                                           
[orange, Pink, Red, Black, Green] 
 */
import java.util.*;


public class TaskLink {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();

        li.add("Red");
        li.add("Green");
        li.add("Black");
        li.add("Pink");
        li.add("Orange");
        System.out.println(li);

        String c = li.remove(1);
        String a = li.removeLast();
        String b = li.removeLast();
        li.addFirst(b);
        li.addFirst(a);
        li.addLast(c);
        System.out.println(li);
    }
}