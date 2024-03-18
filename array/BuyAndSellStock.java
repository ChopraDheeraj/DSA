import java.util.*;

public class BuyAndSellStock{

    public static int BuyAndSellStock(int SellingPrice[]){
    int buyPrice=Integer.MAX_VALUE;
    int maxProfit=0;

    for(int i=0; i<SellingPrice.length; i++){
        if(buyPrice<SellingPrice[i]){
            int profit=SellingPrice[i]-buyPrice;
            maxProfit=Math.max(maxProfit,profit);
        }
        else{
            buyPrice=SellingPrice[i];
        }
    }
    return maxProfit;
}

    public static void main(String args[]){
        int SellingPrice[]={7,1,5,3,6,4};   
        System.out.println(BuyAndSellStock(SellingPrice));     
    }
}