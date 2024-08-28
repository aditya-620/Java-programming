//insert a node in linkedlist using recursion
import java.util.LinkedList;
import org.w3c.dom.Node;

public class recursive_insert {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        // public Node(int data, Node node){
        //     this.data = data;
        //     this.next = node;
        // }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void insert(int val){
        Node temp = new Node(val);
        size++;
        if(head == null){
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        tail.next = null;
    }


    public static void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //recursive insert
    public static void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private static Node insertRec(int val, int index, Node node){
        
        if(index == 0){
            Node temp = new Node(val);
            temp.next = node;
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }


    public static void main(String[] args) {
        recursive_insert ll = new recursive_insert();
        ll.insert(3);
        ll.insert(5);
        ll.insert(9);
        ll.insert(1);
        ll.print();

        ll.insertRec(7,2);
        ll.print();
    }
}
