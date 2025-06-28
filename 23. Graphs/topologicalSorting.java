import java.util.ArrayList;
import java.util.Stack;

public class topologicalSorting {
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

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    public static void topSort(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        Stack<Integer> Stack = new Stack<>();

        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                topSortUtil(graph, visited, Stack, i); //modified DFS
            }
        }

        while(!Stack.isEmpty()){
            System.out.print(Stack.pop() + " ");
        }
    }

    public static void topSortUtil(ArrayList<Edge> graph[], boolean visited[], Stack<Integer> Stack, int curr){
        visited[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!visited[e.dest]) {
                topSortUtil(graph, visited, Stack, e.dest);
            }
        }
        Stack.push(curr); //push the current node to stack after visiting all its neighbors
    }
    public static void main(String[] args) {
        int V = 6; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph, V);
        topSort(graph);
    }
}

//Time Complexity: O(V + E) where V is the number of vertices and E is the number of edges.
// Space Complexity: O(V) for the stack and visited array.