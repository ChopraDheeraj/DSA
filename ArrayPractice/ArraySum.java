import java.util.*;

public class ArraySum{
    public static int sum(int arr[]){
        int s  = 0;
        for(int i=0; i<arr.length; i++){
            s += arr[i];
        }
        return s;
    }


    public static void main(String args[]){
        int arr[] = {2,4,6,7};
        System.out.print(sum(arr));
    }
}