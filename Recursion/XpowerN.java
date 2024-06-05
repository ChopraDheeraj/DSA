import java.util.*;

public class XpowerN{

    public static int power(int x, int n){
        //base case
        if(n==0){
            return 1;
        }
        //int xnm1 = power(x, n-1);
        //int xn = x * xnm1;
        //return xn;

        return x * power(x, n-1);

    }

    public static void main(String args[]){
        int x=2;
        int n=10;
        System.out.print(power(x, n));

    }
}