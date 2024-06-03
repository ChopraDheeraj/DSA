import java.util.*;

public class Factorial{

    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1=Factorial(n-1);
        int fac=n*Factorial(n-1);
        return fac;
    }

    public static void main(String args[]){
        int n = 5;
        System.out.print(Factorial(n));
    }
}