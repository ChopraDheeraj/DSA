//brute force
//returnthe total number of subarrays whose sum equals to k.

import java.util.*;

public class SubArraywithSum {

    public static int calc(int arr[], int target){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int s = 0;
            for(int j=i; j<arr.length; j++){
                s += arr[j];
                if(s == target){
                    count++;
                }
            }
        }
        return count;

    }


    public static void main(String args[]){
        int arr[] = {1, 1, 1};
        int target = 2;
        System.out.print(calc(arr, target));

    }
}
