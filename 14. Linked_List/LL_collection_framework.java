//LinkedList in Java Collection Framework
import java.util.LinkedList;
public class LL_collection_framework {
    public static void main(String args[]){
        //create
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2

        //print
        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-) 