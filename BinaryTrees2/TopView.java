import java.util.*;
import java.util.LinkedList;

public class TopView {

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

    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void toppView(Node root) {
        if (root == null) {
            return;
        }

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0; // Initialize min and max
        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (!map.containsKey(curr.hd)) { // 1st time my hd is occurring
                map.put(curr.hd, curr.node);
            }

            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);
            }

            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1); // Update max
            }
        }

        for (int i = min; i <= max; i++) {
            if (map.get(i) != null) {
                System.out.print(map.get(i).data + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        toppView(root);
    }
}
