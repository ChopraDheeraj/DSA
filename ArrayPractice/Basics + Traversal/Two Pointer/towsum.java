//using 2 pointer approach

import java.util.*;

public class towsum{

    public static int[] sum(int arr[], int target){
        int start = 0, end = arr.length - 1;
        while(end > start){
            int sum = arr[start] + arr[end];
            if(sum == target){
                return new int[]{start,end};
            }
            if(sum > end){
                end--;
            }
            if(start > sum){
                start++;
            }
        }
        return new int[]{-1, -1};
    }


    public static void main(String args[]){
        int target = 13;
        int arr[] = {11,7,2,15};
        Arrays.sort(arr);
        int result[] = sum(arr,target);
        System.out.print(result[0]+ ","+ result[1]); 
    }
}