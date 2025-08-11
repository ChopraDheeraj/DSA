//find max in array

import java.util.*;

public class MinMax{
    public static int findMin(int arr[]){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max= arr[i];
            }
        }
        return max;
    }


    public static void main(String args[]){
        int arr[] = {2,4,5,6};
        System.out.print(findMin(arr));
    }
}