import java.util.*;

public class TilingProblem{

    public static int tiling(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //choice
        int fnm1 = tiling(n-1);  //vertical
        int fnm2 = tiling(n-2);  //horizontal
        int total = fnm1 + fnm2;   //total ways
        return total;
    }


    public static void main(String args[]){
        int m=2;
        int n;
        System.out.println(tiling(4));

    }
}