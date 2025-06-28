import java.util.*;

public class BipartiteCheckUsingCycle {
    public static class Edge {
        int src, dest;
        public Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph, int V) {
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Sample graph
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3)); // Uncomment to make an odd cycle
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        int[] depth = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (hasOddCycle(graph, visited, depth, i, -1, 0)) {
                    return false; // Odd cycle found → not bipartite
                }
            }
        }
        return true; // No odd cycles → bipartite
    }

    public static boolean hasOddCycle(ArrayList<Edge>[] graph, boolean[] visited, int[] depth, int curr, int parent, int currDepth) {
        visited[curr] = true;
        depth[curr] = currDepth;

        for (Edge e : graph[curr]) {
            int neighbor = e.dest;

            if (!visited[neighbor]) {
                if (hasOddCycle(graph, visited, depth, neighbor, curr, currDepth + 1)) {
                    return true;
                }
            } else if (neighbor != parent) {
                // Cycle found
                int cycleLength = Math.abs(depth[curr] - depth[neighbor]) + 1;
                if (cycleLength % 2 == 1) {
                    return true; // Odd cycle
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        /*
               0 ------ 2
              /        /
            /         /
           1         4
            \       /
             \     /
               3 
        */
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph, V);
        System.out.println("Bipartite: " + isBipartite(graph));
    }
}

//Time Complexity: O(V + E)
// Space Complexity: O(V) for the visited and depth arrays.