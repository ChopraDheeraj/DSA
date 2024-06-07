import java.util.*;

public class DecreasingOrder{

    public static void Decreasing(int n){
        //base class
        if( n==1 ){
            System.out.print(n+ " ");
            return ;
        }

        System.out.print(n + " ");
        Decreasing(n-1);
    }


    public static void main(String args[]){
        int n=10;
        Decreasing(n);
    }
}