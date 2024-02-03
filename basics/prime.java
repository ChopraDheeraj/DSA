package basics;
import java.util.*;

public class prime{
  
    public static void primesinRange(int n){
        int isPrimerange=true;
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