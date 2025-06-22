import java.util.ArrayList;

public class DFS {
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

    public static void dfs(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            dfsUtil(graph, i, visited);
        }
    }

    public static void dfsUtil(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        //visited
        System.out.print(curr + " ");
        visited[curr] = true;

        //calling dfs for all the neighbors
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                dfsUtil(graph, e.dest, visited);
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
        dfs(graph);
    }
}

//Time Complexity: O(V + E) where V is the number of vertices and E is the number of edges.
//Space Complexity: O(V) for the visited array and the recursion stack.
// The DFS algorithm explores as far as possible along each branch before backtracking.