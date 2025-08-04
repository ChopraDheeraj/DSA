import java.util.*;


public class SortZeros{

    public static void Sort(int arr[]){
        //count no of zeros
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                count ++;
            }
        }
        //replace the position in beginning with 0s
        for(int i=0; i<arr.length; i++){
            if(count > i){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        //taking array input
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
       
        Sort(arr);
        //printing array input
        System.out.print("Sorted Array:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}