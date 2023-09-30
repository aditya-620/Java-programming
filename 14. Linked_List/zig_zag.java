//program to make a LL zig-zag LL
import org.w3c.dom.Node;

public class zig_zag {
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

    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reserve 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next; 

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alternate merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;

        }

    }
    public static void main(String args[]){
        zig_zag ll = new zig_zag();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        //1->2->3->-4->5->null

        ll.print();
        ll.zigZag();
        ll.print();
        
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)