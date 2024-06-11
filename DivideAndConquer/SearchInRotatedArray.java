import java.util.*;

public class SearchInRotatedArray{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static int Search(int arr[], int tar, int si, int ei){
        //base case
        if(si>ei){
            return -1;
        }

        int mid = si + (ei-si)/2;

        if(arr[mid] == tar){
            return mid;
        }
        //mid on L1
        if(arr[si] <= arr[mid]){
            //case a: L1 left
            if(arr[si] <= tar && tar <= arr[ei]){
                return Search(arr, tar, si, mid-1);
            }
            else{
                //case b: mid right
                return Search(arr, tar, mid+1, ei);
            }
        }
        
        //mid on L2
        else{
            //case c: L1 right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return Search(arr, tar, mid+1, ei);
            }
            else{
                return Search(arr, tar, si, mid-1);
            }
        }

    }


    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int tar=0;
        int SearchingIdx = Search(arr, tar, 0, arr.length-1);
        System.out.println(SearchingIdx);
    }
}