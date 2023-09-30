//doubly LinkedList creation,insertion,deletion program
public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //ADD NODES AT FIRST
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;      
    }

    //ADD NODE AT THE LAST
    public void addLast(int data){
        Node newNode =  new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    //REMOVE FROM FIRST
    public int removeFirst(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(head.next == null){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //REMOVE FROM LAST
    public int removeLast(){
       if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(head.next == null){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        } 
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }
    //PRINT
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);

        dll.print();

        dll.removeFirst();
        dll.removeLast();

        dll.print();
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)