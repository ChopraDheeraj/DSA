import java.util.*;

public class Binarysearch{
    
    public static int bs(int arr[], int key){
        int start = 0, end = arr.length-1;
        
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int key = 6;
        System.out.print(bs(arr,key));
    }
}