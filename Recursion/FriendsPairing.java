import java.util.*;

public class FriendsPairing{

    public static int Pair(int n){
        if(n==1 || n==2){
            return n;
        }
        int totalWays= Pair(n-1) + (n-1)*Pair(n-2);
        return totalWays;
    }
    public static void main(String args[]){
        int n=3;
        System.out.print(Pair(n));
    }
}