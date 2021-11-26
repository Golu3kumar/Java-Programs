package data_structure.Graph;

import java.util.*;


// there are mainly two types of traversal in graph
// 1. DFS(Depth First Traversal)
// -> It uses Stack to traverse the Graph
// -> It traverse all the depth vertices of a particular path, then after change the path.

// 2. BFS(Breath First Search)
// -> It uses Queue to traverse the whole Graph
// -> It traverse all the possible neighbours of a particular vertex, then switch to another vertex.

// First create the Graph
public class GraphTraversal {

    private int v;
    private LinkedList<Integer>[] edgeList;

    public GraphTraversal(int v) {
        this.v = v;
        edgeList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            edgeList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        edgeList[u].add(v);
    }

    public void BFSTraversal(int start) {

        boolean[] visited = new boolean[v];

        visited[start] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        while (!q.isEmpty()) {

            int n = q.poll();
            System.out.print(n + " ");

            for (int a : edgeList[n]) {
                if (!visited[a]) {
                    q.offer(a);
                    visited[a] = true;
                }
            }

        }

    }

    public void DFSTraversal(int start) {
        boolean[] visited = new boolean[v];
        Stack<Integer> stk = new Stack<>();
        stk.push(start);
        visited[start] = true;

        while (!stk.isEmpty()) {
            int n = stk.pop();

            System.out.print(n + " ");

            for (int i : edgeList[n]) {
                if (!visited[i]) {
                    stk.push(i);
                    visited[i] = true;
                }
            }
        }

    }

    public void DFSUtils(int v, boolean[] visited) {

        visited[v] = true;
        System.out.print(v + " ");

        for (int n : edgeList[v]) {
            if (!visited[n])
                DFSUtils(n, visited);
        }
    }

    public void DFSHelper(int v) {

        boolean[] visited = new boolean[this.v];

        DFSUtils(v, visited);
    }



    public static void main(String[] args) {

        GraphTraversal graphTraversal = new GraphTraversal(6);
        graphTraversal.addEdge(0, 1);
        graphTraversal.addEdge(0, 2);
        graphTraversal.addEdge(1, 2);
        graphTraversal.addEdge(2, 0);
        graphTraversal.addEdge(2, 3);
        graphTraversal.addEdge(3, 3);

        System.out.println("BFS Traversal : ");
        graphTraversal.BFSTraversal(2);
        System.out.println();
        System.out.println("DFS Traversal : ");
        graphTraversal.DFSTraversal(0);
        System.out.println();
        System.out.println("DFS With Recursion : ");
        graphTraversal.DFSHelper(0);
    }
}
