import java.util.*;

public class KadanesMaxSubarray3{

    public static void maxx(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE; 

        for(int i=0; i<arr.length; i++){
            cs=cs+arr[i];
            ms=Math.max(cs,ms);
            if(cs<0){
                cs=0;
            }
            
        }
        System.out.println("Maximum sum is: "+ ms);
    }


    public static void main(String args[]){
        int arr[]={-2,-3,-4,-1,-2,-1,-5,-3};
        maxx(arr);
    }
}