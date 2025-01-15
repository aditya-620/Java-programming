import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue1 {
    public static void main(String[] args) {
        //default - ascending order
        //PriorityQueue<Integer> pq = new PriorityQueue<>();

        //descending order
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        pq.add(10);
        pq.add(15);
        pq.add(5);
        pq.add(20);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
