//printing sum of 2nd row in 2d Array
import java.util.*;

public class Q2 {
    public static int Sum(int nums[][]){
        int sum=0;
        for(int j=0; j<nums.length; j++){
            {
                sum+=nums[1][j];
            }
        }
        return sum;
    }

    public static void main(String args[]){
        int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
        System.out.print(Sum(nums));
    }    
}
