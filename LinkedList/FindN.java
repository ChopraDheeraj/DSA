//find and remove nth node from end

import java.util.*;


public class FindN{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int data, int idx){
        //base case
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head; 
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void print(){
        //base case
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNth(int n){
        //size
        int siz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            siz++;
        }

        //head ko hi delete
        if(n == siz){
            head = head.next;  //remove first
            return;
        }

        int i = 1;
        int idxToFind = siz - n;
        Node prev = head;
        while(i < idxToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }



    public static void main(String args[]){
        FindN ll = new FindN();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(3,2);
        ll.print();
        ll.deleteNth(3);
        ll.print();
    }
}