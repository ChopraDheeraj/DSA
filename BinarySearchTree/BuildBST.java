import java.util.*;

public class BuildBST {

    static class Node{
        int data;
        Node left;
        Node right;
        

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            return root = new Node(val);  //matlab 5
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        } 
        if(root.data < val){
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    
    public static void main(String args[]){
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        //ek ek karke values will be passed to our insert function
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root); //to verify well use inOrder traversal
        System.out.println();
    }
}
