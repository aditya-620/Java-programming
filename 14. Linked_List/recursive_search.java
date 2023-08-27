//program to search key in LinkedList by recursive method
import org.w3c.dom.Node;
public class recursive_search {
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

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx =helper(head.next, key);
        if(idx == -1){
           return -1; 
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    public static void main(String args[]){
        recursive_search ll = new recursive_search();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        System.out.println("key is at index: " +ll.recSearch(4));
    }
}

//Time  Complexity: O(n)
//Space Complexity: O(n)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)