import java.util.*;

public class SumNatural{

    public static int SumNaturalNos(int n){
        if(n==1){
            return 1;
        }
        int snm1=SumNaturalNos(n-1);  //snm1= sum of n minus 1
        int sn=n+snm1; //sn=sum of n
        return sn;
    }

    public static void main(String args[]){
       int n = 10;
       System.out.print(SumNaturalNos(n));
    }
}