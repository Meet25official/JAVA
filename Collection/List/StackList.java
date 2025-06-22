import java.util.Stack;

public class StackList {
    public static void main(String[] args) {
        Stack<Integer> li = new Stack<>();
        
        li.add(12);
        li.add(23);
        li.add(34);
        li.add(45);
        li.add(56);
        li.add(67);
        System.out.println(li);
        
        // li.pop();
        // System.out.println(li.peek());
        // System.out.println(li.empty());
        // System.out.println(li.search(67));
        // li.clear();
        // System.out.println(li.size());
        System.out.println(li);
        
    }
}

/*
LIFO - Last In First Out

Methods of Stack:
1. push() - adds an element to the stack
2. pop() - removes an element from the stack
3. peek() - returns the top element of the stack
4. empty() - returns true if the stack is empty
5. search() - returns the position of the element from the top of the stack
6. size() - returns the size of the stack

*/