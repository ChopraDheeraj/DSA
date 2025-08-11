//check if array is sorted

import java.util.*;

public class IsSorted{

    public static boolean check(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        int arr[] = {2, 4, 6, 7};
        System.out.print(check(arr));
    }
}