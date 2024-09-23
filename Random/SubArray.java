import java.util.*;

public class SubArray{
    public static int SA(int arr[]){
        int cs = 0; //0
        int ms = Integer.MIN_VALUE; //0

        for(int i=0; i<arr.length-1; i++){
            cs = cs + arr[i];
            ms = Math.max(ms,cs);
            if(cs<0){
                cs = 0;
            }
        }
        return ms;
    }

    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,-1,-5,-3};
        System.out.print(SA(arr));
        
    }
}