//printing no of 7s in a 2D array:

import java.util.*;

public class Q1{
    public static int print(int matrix[][],int key){
        int count=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length-1; j++){
                if(matrix[i][j]==key){
                    count++;
                }
            }
        }
        return count;
        
    }

    public static void main(String args[]){
        int matrix[][]={{4,7,8},{8,8,7}};
        int key=7;
        System.out.print(matrix,key);

    }
}