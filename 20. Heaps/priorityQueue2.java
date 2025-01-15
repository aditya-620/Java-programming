import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue2 {
static class Students implements Comparable<Students>{
    String name;
    int rank;

    Students(String name, int rank){
        this.name = name;
        this.rank = rank;
    }

    // this function will do the comparison between the ranks of the students
    @Override
    public int compareTo(Students s2) {
        return this.rank - s2.rank;
    }
}
    public static void main(String[] args) {
        
        PriorityQueue<Students> pq = new PriorityQueue<>();

        
        pq.add(new Students("A", 10));
        pq.add(new Students("B", 15));
        pq.add(new Students("C", 5));
        pq.add(new Students("D", 20));

        System.out.println("Students in ascending order of their ranks:");
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}
