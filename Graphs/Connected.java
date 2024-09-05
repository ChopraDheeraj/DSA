import java.util.*;
import java.util.LinkedList;


public class Connected {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
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

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 3, 5));

        graph[5].add(new Edge(5, 3, 2));
        graph[5].add(new Edge(5, 4, 2));
        graph[5].add(new Edge(5, 6, 2));

        graph[6].add(new Edge(6, 5, 2));
    }

    public static void breadth(ArrayList<Edge>[] graph){
        boolean visit[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!visit[i]){ //visit ke andar false store hai
                breadthUtil(graph, visit);
            }
        }
    }

    public static void breadthUtil(ArrayList<Edge>[] graph, boolean visit[]){
        Queue<Integer> q = new LinkedList<>();
       
        q.add(0); //source

        while(!q.isEmpty()){
            int curr = q.remove();

            if(!visit[curr]){ //visit curr
            System.out.println(curr + " ");
            visit[curr] = true;
            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                q.add(e.dest);
            }
        }
    }
    }
    public static void main(String args[]){
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);   
        breadth(graph);    
    }
}
