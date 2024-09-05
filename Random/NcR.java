//binomial coefficient

import java.util.*;

public class NcR{
    public static int factorial(int n, int r){
        //base case
        if(r > n){
            return 0;
        }
        if(r == 0){
            return 1;
        }
        if( r== n ){
            return 1;
        }
        
        int fac1 = factorial(n-1 , r-1);
        int fac2 = factorial(n-1, r);
        return fac1 + fac2;
    }
    
    public static void main(String args[]){
        int n = 5; 
        int r = 3;
        System.out.print(factorial(n,r));
        
    }
}