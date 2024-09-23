import java.util.*;

public class BuySellStock{

    public static int profit(int sp[]){
        int maxProfit = 0;
        int bp = Integer.MAX_VALUE;

        for(int i=0; i<sp.length; i++){
            if(sp[i] > bp){
            int profit = sp[i] - bp;
            maxProfit = Math.max(profit, maxProfit);
        }
        else{
            bp = sp[i];
        }
    }
    return maxProfit;
}


    public static void main(String args[]){
        int sp[] = {7,1,5,3,6,4};
        System.out.print(profit(sp));
    }
}