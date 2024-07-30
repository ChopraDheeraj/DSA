import java.util.*;

public class SearchBST{

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
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean SearchinBST(Node root, int val){
        if(root == null){
            return false;
        }
        if(root.data == val){
            return true;
        }
        if(root.data > val){
            return SearchinBST(root.left, val);
        }
        else{
            return SearchinBST(root.right, val);
        }
    }


    public static void main(String args[]){
        int arr[] = {4,2,7,1,3};
        Node root = null;

        for(int i=0; i<arr.length; i++){
            root = buildBST(root, arr[i]);
        }

        inOrder(root);

        
    }
}