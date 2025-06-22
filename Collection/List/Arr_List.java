import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arr_List {
    public static void main(String[] args) {

        // List list = new ArrayList();
        // list.add(1);
        // list.add(1.2f);
        // list.add(1.44);
        // list.add('d');
        // list.add("string");
        // System.out.println(list);


        List<String> l = new ArrayList<>();   // Type safety

        l.add("Ram");
        l.add("Shiv");
        l.add("Hanuman");
        l.add("Narayan");
        l.add("Krishna");
        l.add("Swaminarayan");

        // l.add(System.console().readLine());

        // ArrayList<String> l1 = new ArrayList<>();

        // l1.add("Parvati");
        // l1.add("Agni");
        // l1.add("Aditi");
        // l1.add("Durga");
        // l1.add("Kali");
        // l1.add("Lakshmi");

        // l.addAll(2,l1);         // from l between 1 to 2 index put l1
        // System.out.println(l);

        // System.out.println(l.get(3));

        // for(String name : l){
        //     System.out.println(name);
        // }

        // l.clear();
        // System.out.println("After using clear :- "+l);

        // itrator() :- 
        // Iterator<String> Bhagvanjis = l.iterator();
        // while(Bhagvanjis.hasNext()){
        //     System.out.println(Bhagvanjis.next());
        // } 

        // l.set(0, "Ramchandra");
        // l.remove(3);
        // l.remove("Swaminarayan");

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Hanuman");
        l2.add("Swaminarayan");
        // l.removeAll(l2);
        // System.out.println(l.size());
        
        System.out.println(l);

        // Object arr[] = l.toArray();
        // System.out.println(Arrays.toString(arr));

        // System.out.println(l.contains("Shiv"));
        // System.out.println(l.containsAll(l2));
    }    
}

/*
            Methods of List
            The List interface includes all the methods of the Collection interface. Its because Collection is a super interface of List.

            Some of the commonly used methods of the Collection interface that's also available in the List interface are:

            add() - adds an element to a list
            addAll() - adds all elements of one list to another
            get() - helps to randomly access elements from lists
            iterator() - returns iterator object that can be used to sequentially access elements of lists
            set() - changes elements of lists
            remove() - removes an element from the list
            removeAll() - removes all the elements from the list
            clear() - removes all the elements from the list (more efficient than removeAll())
            size() - returns the length of lists
            toArray() - converts a list into an array
            contains() - returns true if a list contains specified element
*/