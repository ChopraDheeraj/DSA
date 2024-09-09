import java.util.*;

public class Binarysearch {

    public static int BSs(int arr[], int key){
        int start = 0 ;
        int end = arr.length - 1;
        
        while(end>=start){
            int mid = (start+end)/2;
            if(arr[mid] == key ){
                return mid;
            }
            if(arr[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;

    }
    
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14};
        int key = 5;
        System.out.print(BSs(arr, key));

    }
}
