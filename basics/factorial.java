import java.util.*;

public class factorial{

    public static int hoot(int n){
        int k=1;
        for(int i=1; i<=n; i++){
            k = k * i;
        }
        return k;
    }

    public static void main(String args[]){
        System.out.println(hoot(3));
    }
}