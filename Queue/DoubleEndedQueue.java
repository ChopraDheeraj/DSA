//Deque using jcf java collection framework

import java.util.*;
import java.util.LinkedList;

public class DoubleEndedQueue{

    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.add(2);
        deque.addLast(4);
        deque.addLast(3);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
    }
}