import java.util.*;

public class InsertHeap {

    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
        arr.add(data);
        int x = arr.size()-1;
        int par = (x-1)/2;

        while(arr.get(x) < arr.get(par)){
            //swap
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);
        }
    }
    public void printHeap() {
        System.out.println(arr);
    }
}
    public static void main(String args[]){
        Heap heap = new Heap();
        heap.add(10);
        heap.add(5);
        heap.add(20);
        heap.add(2);

        heap.printHeap(); 
    }
}
