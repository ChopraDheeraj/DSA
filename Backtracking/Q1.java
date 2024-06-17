//Rat in a Maze
import java.util.*;

public class Q1{

    public static int totalWays(int maze[][], int row, int col, int n, boolean visited[][]){
        if(row==n-1 && col==n-1 && maze[row][col]==1){
            return 1;
        }
        if(row<0 || col<0 || row>=n || col>=n || maze[row][col]==0 || visited[row][col]){
            return 0;
        }

        visited[row][col]=true;

        int Total= totalWays(maze, row+1, col, n,visited)+
        totalWays(maze, row, col+1, n, visited)
        +totalWays(maze, row-1, col, n, visited)
        +totalWays(maze, row, col-1, n, visited);
         

        visited[row][col]=false;

        return Total;
    }

    public static void printMaze(int[][] maze, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        int n=4;
        int maze[][]= { { 1, 0, 0, 0 },
        { 1, 1, 0, 1 },
        { 1, 1, 0, 0 },
        { 0, 1, 1, 1 } };
        printMaze(maze, n);
        boolean visited[][] = new boolean[n][n];
        int ways= totalWays(maze, 0, 0, n, visited);
        System.out.println("Total ways are "+ways);
    }
}