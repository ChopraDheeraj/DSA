import java.util.*;

public class MinAbsoluteDiff {

    public static void main(String args[]){
        int arr1[] = {1,4,7,8};
        int arr2[] = {2,3,5,6};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int res=0;
        for(int i=0; i<arr1.length; i++){
            res += Math.abs(arr1[i] - arr2[i]);
        }
        System.out.print(res);
    }
}
