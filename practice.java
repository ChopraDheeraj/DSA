import java.util.*;

public class practice{

    public static void sub(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            cs += arr[i];
            ms = Math.max(ms,cs);
            if(cs < 0){
                cs = 0;
            }
        }
        System.out.print(ms);
    }

    public static void main(String args[]){
        int arr[] = {-2, -3 , 4 , -1, -2, 1 , 5 ,-3};
        sub(arr);
    }
}