package data_structure.Recursion;

public class MazeWithBlocks {

    public static void main(String[] args) {

        int[][] maze = {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,1,1,0}};

        boolean[][] visited = new boolean[maze.length][maze[0].length];

        printAllPath(maze,0,0,"",visited);
    }

    private static void printAllPath(int[][] maze, int x, int y, String result, boolean[][] visited) {
        //base condition
        if (x == maze.length-1 && y == maze[0].length-1){
            System.out.println(result);
            return;
        }
        if (x < 0 || y < 0 || x > maze.length-1 || y > maze[0].length-1 || visited[x][y] || maze[x][y] == 1)
            return;
        visited[x][y] = true;
        printAllPath(maze,x-1,y,result+"T",visited);
        printAllPath(maze,x+1,y,result+"D",visited);
        printAllPath(maze,x,y-1,result+"L",visited);
        printAllPath(maze,x,y+1,result+"R",visited);

        visited[x][y] = false;
    }
}
