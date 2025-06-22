
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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
    public static void createGraph(ArrayList<Edge> graph[], int V) {
        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    public static void bfs(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];

        // Perform BFS for each component of the graph
        // This is necessary in case the graph is disconnected
        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                visited[i] = true; // Mark the starting vertex as visited
                bfsUtil(graph, visited);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge> graph[], boolean visited[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // Start BFS from vertex 0

        while(!q.isEmpty()){
            int curr = q.remove();

            if(!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest); // Add the destination vertex to the queue
                }
            }
        }
    }
    public static void main(String[] args) {
    /* 
         1 ─── 3 
        /      | \
       0       |  5 ─── 6
        \      | /
        2 ─── 4

     */
        int V = 7; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph, V);
        bfs(graph);
    }
}

//Time Complexity: O(V + E) where V is the number of vertices and E is the number of edges.
//Space Complexity: O(V) for the visited array and O(V) for the queue, leading to a total space complexity of O(V).
// This implementation performs a breadth-first search (BFS) on an undirected graph represented using an adjacency list.