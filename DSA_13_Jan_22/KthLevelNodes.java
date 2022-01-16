package DSA_13_Jan_22;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class KthLevelNodes {
    static class node {
        int data;
        node left;
        node right;
    };

    static node newNode(int data) {
        node temp = new node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    };

    static void nodesAtKthLevel(node root,
            int k) {

        if (root == null)
            return;

        Queue<node> que = new LinkedList<node>();

        que.add(root);

        HashSet<Integer> s = new HashSet<Integer>();

        int level = 0;
        int flag = 0;

        while (!que.isEmpty()) {

            int size = que.size();
            while (size-- > 0) {
                node ptr = que.peek();
                que.remove();

                if (level == k) {
                    flag = 1;
                    s.add(ptr.data);
                } else {
                    if (ptr.left != null)
                        que.add(ptr.left);
                    if (ptr.right != null)
                        que.add(ptr.right);
                }
            }
            level++;
            if (flag == 1)
                break;
        }
        for (int it : s) {
            System.out.print(it + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        node root = new node();

        root = newNode(60);
        root.left = newNode(20);
        root.right = newNode(30);
        root.left.left = newNode(80);
        root.left.right = newNode(10);
        root.right.left = newNode(40);
        int level = 1;
        nodesAtKthLevel(root, level);
    }
}
