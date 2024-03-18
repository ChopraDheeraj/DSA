import java.util.*;

public class array2{
    public static int Q2(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.print(arr[i]);
            }
            
        }
        return -1;
    }


public static void main(String args[]){
    int arr[]={4,5,6,7,0,1,2};
    int target=0;
    int result=Q2(arr,target);
    
}
}