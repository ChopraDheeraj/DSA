//same as print subarray, only cs and ms added
import java.util.*;


public class MaxSubarray{

    public static void MaxSum(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                cs =0; 
                for(int k=i; k<=j; k++){
                    cs += arr[k];  //calculating the sum
                }
                    if(cs > ms){
                        ms = cs;
                    }
                }
            }
            System.out.print(ms+" ");
        }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        MaxSum(arr);
    }
}