//faster 
//2 pointer

import java.util.*;

public class SortZeross{

    public static void sort(int arr[]){
        int start = 0, end = arr.length - 1;
        while(end > start){
            if(arr[start] == 1 && arr[end] == 0){
                //swap
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start ++;
                end --;
            }
            if(arr[start] == 0){
                start++;
            }
            if(arr[end] == 1){
                end --;
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Sorted array is: ");
        sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}