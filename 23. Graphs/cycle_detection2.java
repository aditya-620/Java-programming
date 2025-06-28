//cycle detection in directed graph

import java.util.ArrayList;

public class cycle_detection2 {
    public static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[], int V) {
        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }
    public static boolean isCylce(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                if(isCylceUtil(graph, visited, stack, i)){
                    return true; //cycle exists in one of the components
                }
            }
        }
        return false; //no cycle exists in the graph
    }

    public static boolean isCylceUtil(ArrayList<Edge> graph[], boolean visited[], boolean stack[], int curr){
        visited[curr] = true;
        stack[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(stack[e.dest]) {
                return true; //cycle detected
            }
            if(!visited[e.dest] && isCylceUtil(graph, visited, stack, e.dest)) {
                return true; //cycle detected in the recursive call
            }
        }
        stack[curr] = false; //backtrack, remove from stack
        return false; //no cycle detected in this path
    }
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph, V);
        if(isCylce(graph)) {
            System.out.println("Cycle exists in the directed graph.");
        } else {
            System.out.println("No cycle exists in the directed graph.");
        }
    }
}

//Time Complexity: O(V + E) where V is the number of vertices and E is the number of edges.
//Space Complexity: O(V) for the visited and stack arrays.