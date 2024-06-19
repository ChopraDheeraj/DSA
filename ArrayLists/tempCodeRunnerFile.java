import java.lang.reflect.Array;
import java.util.*;

public class MultiArray {
    
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(3);
        list.add(4);
        mainList.add(list2);

        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);    //puri list uthke aajeygi
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }
    }
}
