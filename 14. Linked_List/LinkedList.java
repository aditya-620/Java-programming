//basic operations on LinkedList
import org.w3c.dom.Node;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;   //by default java initialize it as 0  

    public void addFirst(int data){
        //step 1 - create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 - newNode's next points to head
        newNode.next = head;  //link

        //step 3 - head = newNode
        head = newNode;
    }
    public void addLast(int data){
        //step 1 - create node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2
        tail.next = newNode;
        //step 3
        tail = newNode;

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
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head; 
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;  //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        System.out.println("---------------------------------");
        System.out.println("Adding element in middle(after index 2)");
        ll.add(2,9);
        ll.print();

        System.out.println("size of linkedlist is:" +ll.size);

        System.out.println("---------------------------------");
        System.out.println("removing first element");
        ll.removeFirst();
        ll.print();
        System.out.println("size of linkedlist is:" +ll.size);

        System.out.println("---------------------------------");
        System.out.println("removing last element");
        ll.removeLast();
        ll.print();
        System.out.println("size of linkedlist is:" +ll.size);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)