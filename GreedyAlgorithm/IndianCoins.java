import java.util.*;


public class IndianCoins {
    
    public static void main(String args[]){
        Integer coin[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coin, Comparator.reverseOrder());
        int amt = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        int count = 0;
        for(int i=0; i<coin.length; i++){
            if(coin[i] <= amt){
                while(coin[i]<=amt){
                count++;
                amt = amt-coin[i];
                ans.add(coin[i]);
                }
            }
        }
        System.out.println(count);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
