//implementation of queue using LinkedList
public class queues2 {
    static class Node{
        int data;
        Node next;

        Node (int data){
            this.data =data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        //add
        public static voif add(int data){
            Node newNode= new Node(data);

            if(head == null){
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            int result = head.data;
            //single element
            if(head == tail ){
                tail = head= null;
            } else{
                head = head.next;
            }
            return result;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)