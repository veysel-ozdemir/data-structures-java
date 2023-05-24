package Graph;

class GraphApp
{
    public static void main(String[] args) {
        // depth-first search
        Graph dfsGraph = new Graph();
        dfsGraph.addVertex('A'); // 0
        dfsGraph.addVertex('B'); // 1
        dfsGraph.addVertex('C'); // 2
        dfsGraph.addVertex('D'); // 3
        dfsGraph.addVertex('E'); // 4
        dfsGraph.addEdge(0, 1); // AB
        dfsGraph.addEdge(1, 2); // BC
        dfsGraph.addEdge(0, 3); // AD
        dfsGraph.addEdge(3, 4); // DE
        System.out.print("Visits (DFS): "); // expected display: ABCDE
        dfsGraph.dfs(); // depth-first search
        System.out.println();
        // breadth-first search
        Graph bfsGraph = new Graph();
        bfsGraph.addVertex('A'); // 0
        bfsGraph.addVertex('B'); // 1
        bfsGraph.addVertex('C'); // 2
        bfsGraph.addVertex('D'); // 3
        bfsGraph.addVertex('E'); // 4
        bfsGraph.addEdge(0, 1); // AB
        bfsGraph.addEdge(1, 2); // BC
        bfsGraph.addEdge(0, 3); // AD
        bfsGraph.addEdge(3, 4); // DE
        System.out.print("Visits (BFS): "); // expected display: ABDCE
        bfsGraph.bfs(); // breadth-first search
        System.out.println();
        // minimum spanning tree (depth first)
        Graph mstGraph = new Graph();
        mstGraph.addVertex('A'); // 0 (start for mst)
        mstGraph.addVertex('B'); // 1
        mstGraph.addVertex('C'); // 2
        mstGraph.addVertex('D'); // 3
        mstGraph.addVertex('E'); // 4
        mstGraph.addEdge(0, 1); // AB
        mstGraph.addEdge(0, 2); // AC
        mstGraph.addEdge(0, 3); // AD
        mstGraph.addEdge(0, 4); // AE
        mstGraph.addEdge(1, 2); // BC
        mstGraph.addEdge(1, 3); // BD
        mstGraph.addEdge(1, 4); // BE
        mstGraph.addEdge(2, 3); // CD
        mstGraph.addEdge(2, 4); // CE
        mstGraph.addEdge(3, 4); // DE
        System.out.print("Minimum Spanning Tree: "); // expected display: AB BC CD DE
        mstGraph.mst(); // minimum spanning tree (depth first)
        System.out.println();
    }
}