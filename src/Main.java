import org.w3c.dom.Node;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       ArrayList<Integer> value = new ArrayList<>();

       BinaryTree BT = new BinaryTree();
       BT.root = new BinaryTree.Node(1);
       BT.root.left = new BinaryTree.Node(2);
       BT.root.right = new BinaryTree.Node(3);
       BT.root.left.left = new BinaryTree.Node(4);
       BT.root.left.right = new BinaryTree.Node(5);
       BT.root.right.left = new BinaryTree.Node(6);
       BT.root.right.right = new BinaryTree.Node(7);

       System.out.println("the size of BT is " + BT.size(BT.root));
       System.out.println("the sum of BT is "+ BT.sum(BT.root));


    }
}