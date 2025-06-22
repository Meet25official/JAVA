import java.util.Iterator;
import java.util.Vector;

public class VectorList {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        
        for(int i = 0; i < 10; i++) {
            nums.add((int)(Math.random()*1000)); 
        }
    
        Iterator<Integer> i = nums.iterator();
        while(i.hasNext()){
            System.out.println(i.next() + ", ");
        }
    }
}

/*
vector is a growable array of objects.

Methods of vector:

Same as ArrayList except that all the methods of vector are synchronized.

*/