import java.util.ArrayList;
import java.util.Collections;

public class BinaryTree {
    //Represent the node of binary tree
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            //Assign data to the new node, set left and right children to null
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(Node node, int value) {
        if (value < node.data) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println(" Inserted " + value + " to left of " + node.data);
                node.left = new Node(value);
            }
        } else if (value > node.data) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                        + node.data);
                node.right = new Node(value);
            }
        }
    }

    //Represent the root of binary tree
    public Node root;

    public BinaryTree() {
        root = null;
    }

    static int sum = 0;

    public int size(Node root) {
        if (root == null)
            return 0;
        int count = 0;
        count++;
        count += size(root.left);
        count += size(root.right);
        return count;
    }

    public int sum(Node root) {
        if (root == null)
            return 0;
        return (root.data + sum(root.left) +
                sum(root.right));
    }
}

