import java.util.*;

public class GridWays{

    public static int printGrid(char Grid[][], int x, int y, int n){
        //base case
        if(Grid[x-1][y-1] == n){
            count = 1;
            return count;
        }
        //kaam
        if(x>=0 && y>=0){
        int totalWays = printGrid(x+1,y)+printGrid(x, y+1);
        System.out.print(totalWays);
        count++;
        return count;
        }
    }

    static int count = 0;
    public static void main(String args[]){
        int n=4;
        char Grid[][] = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                Grid[i][j] = 'X';
            }
        }
        printGrid(Grid, 0, 0, 4);
    }
}