import java.util.*;

public class practice{

    public static boolean isSorted(int arr[]){
        int i;
        for(i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
            
        }
        return true;
    }

    public static void main(String args[]){
        int arr[] = {1,2,5,6};
        System.out.print(isSorted(arr));
    
    }
}