import java.util.*;
import java.util.LinkedList;

public class bipartite {
    public static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[], int V){
        //If graph doesn't have cycles, it can be bipartite
        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));
    }
    public static boolean isBipartite(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        int color[] = new int[graph.length]; 

        for(int i=0; i<graph.length; i++){
            color[i] = -1; // Initialize all vertices with no color
        }

        for(int i=0; i<graph.length; i++){
            if(color[i] == -1){ // If the vertex is not colored
                if(isBipartiteUtil(graph, visited, color, i)){
                    return true; 
                }
            }
        }
        return false;
    }
    public static boolean isBipartiteUtil(ArrayList<Edge> graph[], boolean visited[], int color[], int curr){
        Queue<Integer> q = new LinkedList<>();
        q.add(curr);
        visited[curr] = true;
        color[curr] = 0; // Assign first color

        while(!q.isEmpty()){
            int node = q.remove();

            for(int i=0; i<graph[node].size(); i++){
                Edge e = graph[node].get(i);

                if(color[e.dest] == -1){
                    int nextcolor = color[node] == 0 ? 1 : 0; // Alternate color
                    color[e.dest] = nextcolor; // Assign color to the adjacent vertex
                    q.add(e.dest);
                    visited[e.dest] = true; // Mark as visited
                } else if(color[e.dest] == color[node]){
                    // If the adjacent vertex has the same color, it's not bipartite
                    return false;
                }
            }
        }
        return true; // All adjacent vertices have different colors
    }

    public static void main(String[] args) {
        /*
               0 ------ 2
              /       /
            /        /
            1      4
            \     /
              \  / 
               3 
         */
        int V = 5; // number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph, V);
        System.out.println("Bipartite: " + isBipartite(graph));
    }
}

//Time Complexity: O(V + E) where V is the number of vertices and E is the number of edges.
// Space Complexity: O(V) for the visited and color arrays.