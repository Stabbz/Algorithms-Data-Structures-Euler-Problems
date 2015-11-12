package bst;

/**
 * Created by Damyan Damyanov <damyan.damyanov@scalefocus.com> on 11/11/15.
 */
public class BinarySearchTree {

    public static class Node {
        public Node left;
        public Node right;
        public int value;

        public Node(int val) {
            this.value = val;
        }
    }

    public void insert(Node node, int val) {

        if (node.value < val) {
            if (node.right != null) {
                insert(node.right, val);
            } else {
                node.right = new Node(val);
                System.out.println("Inserted value: " + val + " to the right of: " + node.value);
            }
        } else if (node.value > val) {
            if (node.left != null) {
                insert(node.left, val);
            } else {
                node.left = new Node(val);
                System.out.println("Inserted value: " + val + " to the left of: " + node.value);
            }
        }
    }

    public void inOrderTraversal(Node node) {

        if (node.left != null) {
            inOrderTraversal(node.left);
        }
        System.out.println("Visiting node with value: " + node.value);

        if (node.right != null) {
            inOrderTraversal(node.right);
        }

    }
}
