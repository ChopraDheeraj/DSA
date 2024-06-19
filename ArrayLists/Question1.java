//Monotonic ArrayList

import java.util.*;


public class Question1 {

    public static boolean monotonic(ArrayList<Integer> list){
        boolean increasing = true;
        boolean decreasing = false;
        for(int i=0; i<list.size()-1; i++){
                if(list.get(i) < list.get(i+1)){
                    decreasing = false;
                }
                if(list.get(i) > list.get(i+1)){
                    increasing=false;
                }
            }
            return increasing || decreasing;
        }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
     
        System.out.print(monotonic(list));

    }
}
