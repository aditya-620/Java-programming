import java.util.*;
public class graph1 {
    public static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    public static void main(String[] args) {
    /*    
                   (5)
                0 ----- 1
                    /   \
                (1)/     \(3)
                  2 ----- 3
                  |     
                  |(2)
                  |     
                  4 
     */

        int V = 5; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V];
        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        //0 - vertice
        graph[0].add(new Edge(0, 1, 5));

        //1 - vertice
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        //2 - vertice
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 2));
        graph[2].add(new Edge(2, 4, 2));

        //3 - vertice
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 2));

        //4 - vertice
        graph[4].add(new Edge(4, 2, 2));

        // neighbors of vertex 2
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println("Source: " + e.src + ", Destination: " + e.dest + ", Weight: " + e.weight);
        }
    }
}
