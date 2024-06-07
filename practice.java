import java.util.*;

public class practice{

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void MergeSort(int arr[], int si, int ei){
        //base case
        if(ei<=si){
            return;
        }
        int mid = si + (ei-si)/2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);
        Merge(arr, si, mid, ei);
    }

    public static void Merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i]=temp[k];
        }

    }
    public static void main(String args[]){
        int arr[] = {2,8,9,1,5,4};
        MergeSort(arr, 0, arr.length-1);
        printArr(arr);

    }
}