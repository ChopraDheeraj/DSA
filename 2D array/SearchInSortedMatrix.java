import java.util.*;

public class SearchInSortedMatrix{
    public static boolean Search(int matrix[][],int key){
        int row=0, col=matrix.length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.print("found at key(" + row + "," + col + ")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.print("key not found");
            return false;

    }
    
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=33;
        Search(matrix, key);
    }
}