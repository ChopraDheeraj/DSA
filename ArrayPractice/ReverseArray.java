import java.util.*;

public class ReverseArray{
    public static void rev(int arr[]){
        int f = 0 , l = arr.length - 1;
        while(l>f){
            int temp = arr[l];
            arr[l] = arr[f];
            arr[f] = temp;
            l--;
            f++;
        }
    }


    public static void main(String args[]){
        int arr[] = {1,4,5,6};
        rev(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}