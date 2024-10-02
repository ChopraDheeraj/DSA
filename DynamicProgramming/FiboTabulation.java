import java.util.*;

public class FiboTabulation {
    public static int calc(int n){
        int dp[] = new int[n+1];
        // initialisation
        dp[1] = 1;
        dp[0] = 0; 

        for(int i=2; i<dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    
    public static void main(String args[]){
        int n= 5;
        System.out.print(calc(n));
    }
}
