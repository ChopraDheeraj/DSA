import java.util.*;

public class insertionsort{
    public static void insert(int arr[]){

        //outer loop
        for(int i=1; i<arr.length; i++){
            int currElement= arr[i];
            int prevElement=i-1;
            
            //finding our pos to insert
            while(prevElement>=0 && arr[prevElement]>currElement){
                arr[prevElement+1]=arr[prevElement];
                prevElement--;
            }
            //insertion
            arr[prevElement+1]=currElement;
        }
    }

    //printing array
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        insert(arr);
        printArr(arr);

    }
}