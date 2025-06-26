// Detecting cycle in an undirected graph using DFS
import java.util.ArrayList;

class cycle_detection1{
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));       
    }
    public static boolean detectCycle(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                if(cycleDetectUtil(graph, visited, i, -1)){
                    return true;
                    //cycle exists in one of the components
                }
            }
        }
        return false; //no cycle exists in the graph
    }
    public static boolean cycleDetectUtil(ArrayList<Edge> graph[], boolean visited[], int curr, int par){
        visited[curr] = true; //mark current node as visited

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            //case 3
            if(!visited[e.dest]){
                if(cycleDetectUtil(graph, visited, e.dest, curr)){
                    return true; 
                }
            } 
            //case 1
            else if(visited[e.dest] && e.dest != par){
                return true;
            }
            //case 2: do nothing, just continue
        }
        return false; //no cycle found in this path
    }
    public static void main(String[] args) {
        /*
              0 ----- 3
            / |       |
           1  |       4
            \ |
              2
        */

        int V = 5; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph, V);
        System.out.println("Cycle exists: " + detectCycle(graph));
    }
}

//Time Complexity: O(V + E) where V is the number of vertices and E is the number of edges.
//Space Complexity: O(V) for the visited array and the recursion stack.