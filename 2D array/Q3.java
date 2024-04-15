//transpose of matrix

import java.util.*;

public class Q3{
    public static int[][] Transpose(int arr[][]){
        int rows = arr.length;
        int cols = arr[0].length;
        int transposed[][] = new int[cols][rows]; 

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                //swap
               transposed[j][i]=arr[i][j];
                
            }
        }
        return transposed;
    }

    public static void main(String args[]){
        int arr[][]={{11,12,13},{21,22,23}};
        int transposed[][]=Transpose(arr);
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    
    }
}