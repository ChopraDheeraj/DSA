import java.util.*;

public class PrintInRange {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node buildBST(Node root, int val){
        if(root == null){
            root = new Node(val);
        }
        if(root.data > val){
            root.left = buildBST(root.left, val);
        }
        if(root.data < val){
            root.right = buildBST(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }

    public static void printRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data > k1){
            printRange(root.left, k1, k2);
        }
        if(root.data >= k1 && root.data <= k2){
            System.out.print(root.data+" ");
        }
        if(root.data < k2){
            printRange(root.right, k1, k2);
        }
    }

    public static void main(String args[]){
        int arr[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0; i<arr.length; i++){
            root = buildBST(root, arr[i]);
        }
        
        //inOrder(root);
        printRange(root, 5, 12);

    }
}
