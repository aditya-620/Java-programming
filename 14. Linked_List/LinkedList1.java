//program to remove Nth Node from end
import org.w3c.dom.Node;

public class LinkedList1 {
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

    public void deleteNthfromEnd(int n){
        //calculate size
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(n == size){
            head = head.next;  //remove first
            return;
        }

        //size-n
        int i = 1;
        int iTofind = size-n;
        Node prev = head;
        while(i < iTofind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String args[]){
        LinkedList1 ll = new LinkedList1();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        ll.deleteNthfromEnd(2);
        ll.print();
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-) 