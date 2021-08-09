package dsa.graphs.adjList;

import dsa.graphs.adjMatrix.Graph;

public class GraphAdjListMain {
    public static void main(String[] args){
        GraphAdjList theGraph = new GraphAdjList();
        theGraph.addVertex("A");
        theGraph.addVertex("B");
        theGraph.addVertex("C");
        theGraph.addVertex("D");
        theGraph.addVertex("E");
        theGraph.addVertex("F");
        theGraph.addVertex("G");
        theGraph.addVertex("I");


        theGraph.addEdges(0, 1);
        theGraph.addEdges(1, 2);
        theGraph.addEdges(0, 3);
        theGraph.addEdges(3, 4);
        theGraph.addEdges(4, 5);
        theGraph.addEdges(1, 3);
        theGraph.addEdges(7, 6);
        theGraph.addEdges(3,7 );

        System.out.println("Visits: ");
        theGraph.dfs(0);
        System.out.println();

        System.out.println("BFS: ");
        theGraph.bfs();
        System.out.println();

        int sc=0;
        System.out.println(theGraph.isGraphConnected(sc));
    }
}

