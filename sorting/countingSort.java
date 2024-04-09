import java.util.*;

public class countingSort{
    public static void count(int arr[]){
        //calculating range of count array
        int largest=Integer.MIN_VALUE;  //-infinty
        for(int i=0; i<arr.length; i++){
            largest=Math.max(largest, arr[i]); //max of largest and arr
        }

        int count[]= new int[largest+1]; //+1 beacuase 0 se start krenge
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //count sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        count(arr);
        printArr(arr);


    }
}