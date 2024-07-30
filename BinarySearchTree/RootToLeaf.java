import java.util.*;

public class RootToLeaf {

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

    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }
    public static void printRootLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRootLeaf(root.left, path);
        printRootLeaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static void main(String args[]){
        int arr[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0; i<arr.length; i++){
            root = buildBST(root, arr[i]);
        }
        
        printRootLeaf(root, new ArrayList<>());

    }
}
