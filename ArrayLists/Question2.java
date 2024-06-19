//Lonely Numbers in ArrayList

import java.util.*;


public class Question2 {

    public static ArrayList<Integer> lonely(ArrayList<Integer> list){
        ArrayList<Integer> lonelyNumbers = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            //calculate adjacent
            int adj = list.get(i)+1;
            int adj2 = list.get(i)-1;
            if (!list.contains(adj) && !list.contains(adj2)) {
                lonelyNumbers.add(list.get(i)); 
            }
        }
        return lonelyNumbers;        
    }
    
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(6);
        list.add(13);
        System.out.print(lonely(list));
    }
}
