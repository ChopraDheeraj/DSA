import java.util.*;

public class arrayBacktrack{

    public static void BacktrackArr(int arr[], int i, int val){ //i= index, val= value at index
        //base case
        if(i == arr.length){
            printArr(arr);
            return;
        }
        //kaam recursion
        arr[i] = val;
        BacktrackArr(arr, i+1, val+1);  //fn call step
        arr[i] = arr[i] - 2;        //back tracking step
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = new int[5];
        BacktrackArr(arr,0,1);  
        printArr(arr);
        
    }
}