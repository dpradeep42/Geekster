package DSA_12_Jan_22;

import java.util.Queue;
import java.util.LinkedList;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}

class BinaryTreeNodes {

    Node root;

    int getfullCount() {
        if (root == null)
            return 0;

        Queue<Node> queue = new LinkedList<Node>();

        queue.add(root);

        int count = 0;
        while (!queue.isEmpty()) {

            Node temp = queue.poll();
            if (temp.left != null && temp.right != null)
                count++;

            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        return count;
    }

    public static void main(String args[]) {
        BinaryTreeNodes tree_level = new BinaryTreeNodes();
        tree_level.root = new Node(2);
        tree_level.root.left = new Node(7);
        tree_level.root.right = new Node(5);
        tree_level.root.left.right = new Node(6);
        tree_level.root.left.right.left = new Node(1);
        tree_level.root.left.right.right = new Node(11);
        tree_level.root.right.right = new Node(9);
        tree_level.root.right.right.left = new Node(4);

        System.out.println(tree_level.getfullCount());
    }
}
