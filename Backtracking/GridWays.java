import java.util.*;

public class GridWays{

    public static int printGrid(char Grid[][], int x, int y, int n){
        //base case
        if(x==n-1 && y == n-1){
            return 1;
        }
        if(x==n || y==n){
            return 0;
        }
        //kaam
        
        int totalWays = printGrid(Grid,x+1,y,n)+printGrid(Grid,x,y+1,n);
        return totalWays;
        
    }

    public static void main(String args[]){
        int n=4;
        char Grid[][] = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                Grid[i][j] = 'X';
            }
        }
       int ways= printGrid(Grid, 0, 0, 4);
       System.out.print("Total ways are"+ways);
    }
}