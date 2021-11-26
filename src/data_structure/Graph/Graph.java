package data_structure.Graph;


public class Graph {
    private final boolean[][] adjMatrix;
    private final int vertexCount;

    public Graph(int vertexCount) {
        this.vertexCount = vertexCount;
        adjMatrix = new boolean[this.vertexCount][this.vertexCount];
    }

    // method for adding edge between two vertices
    public void addEdge(char s, char d) {
        // if lower case
        s = lowerToUpperCase(s);
        d = lowerToUpperCase(d);

        int v1 = getIndex(s);
        int v2 = getIndex(d);
        if (v1 == -1 || v2 == -1) {
            return;
        }
        adjMatrix[v1][v2] = true;
    }

    // method for removing edge between two vertices
    public void removeEdge(char s, char d) {
        s = lowerToUpperCase(s);
        d = lowerToUpperCase(d);
        int v1 = getIndex(s);
        int v2 = getIndex(d);
        if (v1 == -1 || v2 == -1) {
            return;
        }
        adjMatrix[v1][v2] = false;
    }

    // has edge between two vertices of not
    public boolean hasEdge(char s, char d) {
        s = lowerToUpperCase(s);
        d = lowerToUpperCase(d);
        int v1 = getIndex(s);
        int v2 = getIndex(d);
        if (v1 == -1 || v2 == -1) {
            return false;
        }
        return adjMatrix[v1][v2];
    }
    // printing the adjacency matrix
    public boolean[][] getAdjMatrix(){
        return adjMatrix;
    }

    private int getIndex(char a) {
        return (a - 'A') <= this.vertexCount ? (a - 'A') : -1;
    }

    private char lowerToUpperCase(char a) {
        if (Character.isLowerCase(a))
            return Character.toUpperCase(a);
        return a;
    }



}
