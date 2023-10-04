//opterations on deque using JCF
import java.util.*;
import java.util.LinkedList;
public class Deque_ {
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);

        System.out.println(deque);  
        deque.removeFirst();
        System.out.println(deque);

        System.out.println("first element = "+deque.getFirst());
        System.out.println("last element = "+deque.getLast());
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)