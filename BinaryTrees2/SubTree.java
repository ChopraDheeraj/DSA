import java.util.*;

public class SubTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public boolean isIdentical(Node node, Node subRoot) {
        if (subRoot == null && node == null) {
            return true;
        } else if (subRoot == null || node == null || subRoot.data != node.data) {
            return false;
        } else if (!isIdentical(node.left, subRoot.left)) {
            return false;
        } else if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;
    }

    public boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        SubTree tree = new SubTree();
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.print(tree.isSubtree(root, subRoot));
    }
}
