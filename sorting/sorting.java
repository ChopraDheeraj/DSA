import java.util.*;

//bubble sort in descending order

public class sorting{
    
    public static void Bubble(int arr[]){
        for(int turns=0; turns<arr.length; turns++){
            for(int j=0; j<arr.length-1-turns; j++){
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        Bubble(arr);
        printArr(arr);
    }
}