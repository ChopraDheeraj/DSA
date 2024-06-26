//check if linked list is palindrome

import java.util.*;


public class CheckPalindrome{

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

   public Node findMid(Node head){
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next!= null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow; //slow is mid
   }

   public boolean checkPalindrome(){
    //base case
    if(head == null || head.next == null){
        return true;
    }
    //step-1) find mid
    Node midNode = findMid(head);

    //step-2) reverse 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node right = prev;
    Node left = head;

    //step-3) check left half and right half 
    while(right != null){
        if(left.data != right.data){
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
   }



    public static void main(String args[]){
        CheckPalindrome ll = new CheckPalindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(1);
        ll.addLast(2);
        ll.print();
        System.out.println(ll.checkPalindrome());
        

    }
}
