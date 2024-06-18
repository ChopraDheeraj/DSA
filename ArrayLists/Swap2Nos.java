import java.util.*;

public class Swap2Nos{

    public static void Swap(ArrayList<Integer> list, int idx1, int idx2){
        //swap
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(1);
        int idx1= 0; int idx2 =3;
        Swap(list, idx1, idx2);
        System.out.print(list);

        
    }
}