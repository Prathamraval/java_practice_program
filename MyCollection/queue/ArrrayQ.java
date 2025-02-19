package MyCollection.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ArrrayQ {
	public static void main(String[] args) {
        ArrayDeque<String> de_que = new ArrayDeque<String>(); 
        
        // Use add() method to add elements into the Deque 
        de_que.add("Welcome"); 
        de_que.add("To"); 
        de_que.add("Geeks"); 
        de_que.add("4"); 
        de_que.add("Geeks"); 
  
        // Displaying the ArrayDeque 
        System.out.println("Initial ArrayDeque: " + de_que); 
  
        // Displaying the head 
        System.out.println("The element at head is: " +  
                                           de_que.peek()); 
  
        // Displaying the ArrayDeque after operation 
        System.out.println("Final ArrayDeque: " + de_que); 
        String deleted= de_que.removeFirst();
        System.out.println("deleted: " + deleted); 
        System.out.println("The element at head is: " +  de_que.peek()); 

        System.out.println("---------------------");
        
        Deque<String> dq = new ArrayDeque<String>();

        // add() method to insert
        dq.push("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");

        //poll and peek doesn't throw exception while queue is empty but pop gives
        System.out.println(dq);
      
        System.out.println("from poll: "+dq.poll());
        System.out.println(dq);

        System.out.println("from peek: "+dq.peek());
        System.out.println("from pop : "+dq.pop());
        System.out.println(dq);

        System.out.println(dq.pollFirst());
        System.out.println(dq);

        System.out.println(dq.pollLast());        
        
	}
}
