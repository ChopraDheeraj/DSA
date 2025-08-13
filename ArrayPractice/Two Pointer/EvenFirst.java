import java.util.*;

public class EvenFirst{

    public static void calc(int arr[]){

        int first = 0, last = arr.length - 1;
        while(last > first){
            if(arr[first] % 2 == 0){
                first++;
            }
            else if(arr[last] % 2 != 0){
                last--;
            }
            //swap
            else{
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array");

        int n = sc.nextInt();

        int arr[] = new int[n]; //memory of array i.e n

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();    //takes value of array 1 by 1
        }

        System.out.print("Sorted array is");
        calc(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}