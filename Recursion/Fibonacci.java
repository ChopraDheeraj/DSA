import java.util.*;

public class FIbonacci{
    public static int PrintFibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int fibo=PrintFibo(n-1) + PrintFibo(n-2);
        return fibo;

    }
    

    public static void main(String args[]){
        int n = 7; 
        System.out.print(PrintFibo(n));

    }
}