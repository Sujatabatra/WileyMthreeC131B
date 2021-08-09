package dsa.graphs.adjList;

import java.util.*;

public class GraphAdjList {

    class vertex{
        private String label;
        private boolean visited;
        public vertex(String label){
            this.label=label;
            this.visited=false;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }

        public void setVisited(boolean visited) {
            this.visited = visited;
        }

        public boolean isVisited() {
            return visited;
        }
    }
    private vertex[] vertices;
    private int nVertexs;
    private List<List<Integer>> graph;
    private Stack<Integer> s;
    private Queue<Integer> q;
    private boolean isConnected=false;

    public GraphAdjList(){
        nVertexs=0;
        vertices=new vertex[20];
        graph=new ArrayList<>();
        s=new Stack<>();
        q=new LinkedList<>();
    }

    void addVertex(String label){
        vertices[nVertexs++]=new vertex(label);
        graph.add(0,new ArrayList<>());

    }
    void addEdges(int a,int b){
        graph.get(a).add(b);
        graph.get(b).add(a);
    }
    void displayVertex(int v){
        System.out.print(vertices[v].getLabel()+" ");
    }

    List<Integer> get(int v){
        return graph.get(v);
    }
    int getAdjUnvisitedVertices(int v){
        for(int i=0;i<v;i++){
            if(graph.get(v).contains(i) && !vertices[i].isVisited()){
                return i;
            }
        }
        return -1;
    }
    public void dfs(int start) {
        Stack<Integer> stack = new Stack<>();

        stack.push(start);
        vertices[start].setVisited(true);

        while(!stack.isEmpty()) {
            Integer node = stack.pop();
            System.out.print(vertices[node].getLabel() + " ");

            List<Integer> neighboursList = graph.get(node);

            for(Integer neighbour: neighboursList) {
                if(!vertices[neighbour].isVisited()) {
                    stack.push(neighbour);
                    vertices[neighbour].setVisited(true);
                }
            }
        }
    }
//    void dfs(int v){
//        vertices[v].setVisited(true);
//        if(!vertices[v].isVisited()){
//            displayVertex(v);
//        }
//        List<Integer> neigh=get(v);
//        for(int i:neigh){
//            if(!vertices[i].isVisited()){
//                displayVertex(i);
//                dfs(i);
//            }
//        }
//    }

    boolean isGraphConnected(int start){
        for(int i=0;i<nVertexs;i++){
            vertices[i].setVisited(false);
        }
        dfs(start);
        for(int i=0;i<nVertexs;i++){
           if(!vertices[i].isVisited()){
               return false;
           }

        }
        return true;
    }


    void bfs(){
        for(int i=0;i<nVertexs;i++){
            vertices[i].setVisited(false);
        }
       q.add(0);
       vertices[0].setVisited(true);
       while(!q.isEmpty()){
           int node=q.remove();
           displayVertex(node);

           List<Integer> neigh=get(node);
           for(int i:neigh){
               if(!vertices[i].isVisited()){
                   q.add(i);
                   vertices[i].setVisited(true);
               }
           }
       }

    }
}
