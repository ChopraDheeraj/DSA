import java.util.*;

public class ValidateBST{

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

    public static boolean isValidate(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >=  max.data){
            return false;
        }
        return isValidate(root.left, min, root) && isValidate(root.right, root, max);  
    }

    public static void main(String args[]){
        int arr[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0; i<arr.length; i++){
            root = buildBST(root, arr[i]);
        }
        
        if(isValidate(root, null, null)){
            System.out.print("valid");
        }
        else{
            System.out.print("invalid");
        }

    }
}
