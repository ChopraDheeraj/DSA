import java.util.*;


public class LastOccurence {
    public static int PrintLastOccur(int arr[], int key, int i){

        if(i == arr.length){
            return -1;
        }

       int isFound= PrintLastOccur(arr, key, i+1);
       if(isFound == -1 && (arr[i]==key)){
        return i;
       }
       return isFound;

    }
    
    public static void main(String args[]){
        int arr[]={1,2,4,5,6,7,5};
        int key=5;
        System.out.print(PrintLastOccur(arr, key, key));
    }
}
