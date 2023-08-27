//program to search key in LinkedList by iterative method
import java.util.LinkedList;
import org.w3c.dom.Node;

public class iterative_search {
    public static class Node{
        int data;
        Node next;

        public  Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;  //key found
            }
            temp = temp.next;
            i++;
        }

        //key not found
        return -1;
    }

    public static void main(String args[]){
        iterative_search ll = new iterative_search();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        System.out.println("key is present at index: " +ll.itrSearch(4));
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)