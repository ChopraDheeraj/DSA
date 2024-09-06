import java.util.*;

public class rangePrime{

    public static boolean isPrimerange(int n){
        //base case
        if(n==2){
            return true;
        }

        for(int i = 2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
  
    public static void primesinRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrimerange(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        primesinRange(20);

    }
}