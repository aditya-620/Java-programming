//check whether a LL is a palindrome or not
import org.w3c.dom.Node;

public class palindrome {
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

    //slow-fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;  //+1
            fast = fast.next.next; //+2
        }
        return slow;  //slow is our mid
    }

    public boolean checkPalindrome(){
        //base case - if LL has only 1 node
        if(head == null || head.next == null){
            return true;
        }
        //step1- find mid
        Node midNode = findMid(head);

        //step2- reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right half head
        Node left = head;  

        //step3 - check 1st half and 2nd half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static void main(String args[]){
        palindrome ll = new palindrome();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        System.out.println(ll.checkPalindrome()); 
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-) 