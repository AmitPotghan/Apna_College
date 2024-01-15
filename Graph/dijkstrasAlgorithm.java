import java.util.*;
public class dijkstrasAlgorithm {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s,int d,int w){
            this.src= s;
            this.dest=d;
            this.wt=w;
        }
    }
    static class Pair implements Comparable<Pair>{
        int n;
        int path;

        public Pair(int n,int p){
            this.n=n;
            this.path=p;
        }
        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;//path based sorting for my pairs
        }
    }

    public static void CreateGraph(ArrayList<Edge>[]graph){
        for (int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }
    public static void dijkstras(ArrayList<Edge>[]graph,int src){
        int dist[] = new int[graph.length];
        for (int i=0;i<graph.length;i++){
            if (src != i){
                dist[i] = Integer.MAX_VALUE; //+infinity
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[graph.length];

        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if (!vis[curr.n]){
                vis[curr.n] = true;
                for (int i=0;i<graph[curr.n].size();i++){
                    Edge e = graph[curr.n].get(i);
                    int u= e.src;
                    int v= e.dest;
                    int wt= e.wt;

                    if (dist[u] + wt < dist[v]){
                        //update
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for (int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V=6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[]graph = new ArrayList[V];
        CreateGraph(graph);
        dijkstras(graph, 0);
    }
}
