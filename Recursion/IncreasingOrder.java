import java.util.*;

public class IncreasingOrder{

    public static void printIncreasing(int n){
        if(n==1){  //base case
            System.out.print(n+ " ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");

    }

    public static void main(String args[]){
        int n=5;
        printIncreasing(n);
    }
}