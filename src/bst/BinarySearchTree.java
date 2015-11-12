package bst;

/**
 * Created by Damyan Damyanov <damyan.damyanov@scalefocus.com> on 11/11/15.
 */
public class BinarySearchTree {

    public Node root;
    // used when inserting recursively
    Node current;

    /**
     * Tree Node model.
     */
    public static class Node {
        public Node left;
        public Node right;
        public int value;

        public Node(int val) {
            this.value = val;
        }
    }


    /**
     * Insert value into the tree.
     */
    public void insert(int val) {

        if (root == null) {
            root = new Node(val);
            current = root;
        } else if (current.value < val) {
            if (current.right != null) {
                current = current.right;
                insert(val);
            } else {
                current.right = new Node(val);
                System.out.println("Inserted value: " + val + " to the right of: " + current.value);
                current = root;
            }
        } else if (current.value > val) {
            if (current.left != null) {
                current = current.left;
                insert(val);
            } else {
                current.left = new Node(val);
                System.out.println("Inserted value: " + val + " to the left of: " + current.value);
                current = root;
            }
        }
    }

    /**
     * Print the elements in the tree inorder.
     */
    public void printInorder(){
        printInOrderRec(root);
        System.out.println("");
    }

    /**
     * Helper function for printInOrder()
     */
    private void printInOrderRec(Node currentNode){
        if ( currentNode == null ){
            return;
        }
        printInOrderRec(currentNode.left);
        System.out.print(currentNode.value+", ");
        printInOrderRec(currentNode.right);
    }
}
