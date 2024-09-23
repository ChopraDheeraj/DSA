import java.util.*;

public class revArray{
    public static int reverse(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            //swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        System.out.print(reverse(arr));

    }
}