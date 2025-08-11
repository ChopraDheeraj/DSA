import java.util.*;

public class TwoSum{

    public static int sum(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            int start = arr[i];
            for(int j=i+1; j<arr.length; j++){
                int next = arr[j];
                if(start + next == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int []{-1,-1};
    }


    public static void main(String args[]){
        int target = 9;
        int arr[] = {2,7,11,15};
        System.out.println(sum(arr, target));
    }

}