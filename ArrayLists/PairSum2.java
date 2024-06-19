import java.util.*;

public class PairSum2 {

    public static boolean pairSum(ArrayList<Integer> arr, int target){
        //find breaking point 
        int bp = -1;
        int n = arr.size();
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) > arr.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;
        while(lp != rp){
            if(arr.get(lp) + arr.get(rp+1) == target){
                return true;
            }
            if(arr.get(lp) + arr.get(rp+1) < target){
                lp = (lp+1)%n;
            }
            else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        int target = 100;  
        System.out.println(pairSum(arr, target));  
    }
}
