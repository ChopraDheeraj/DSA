import java.util.*;

public class TowerOfHanoi{

    public static void TowerHanoi(int n, char source, char destn, char aux){
        if(n==0){
            return;
        }
        TowerHanoi(n-1, source, aux, destn);
        System.out.println("Move disk "+n+" from rod "+source+" to rod "+destn);
        TowerHanoi(n-1,aux,destn, source);
        
    }

    public static void main(String args[]){
        int n=3;
        TowerHanoi(n,'A', 'C', 'B');

    }
}