//brute force withput printing the subarrays
import java.util.*;

public class maxsubarrays {
    public static void MaxSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10};
        MaxSum(arr);
    }
}
