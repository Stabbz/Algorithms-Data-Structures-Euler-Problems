import bst.BinarySearchTree;
import linkedlist.LinkedListDz;

/**
 * Created by Damyan Damyanov <damyan.damyanov@scalefocus.com> on 11/11/15.
 */
public class Main {

    public static void main(String[] args) {

        LinkedListDz list = new LinkedListDz();

        BinarySearchTree tree = new BinarySearchTree();

        BinarySearchTree.Node root = new BinarySearchTree.Node(5);

        tree.insert(root, 3);
        tree.insert(root, 2);
        tree.insert(root, 1);
        tree.insert(root, 7);
        tree.insert(root, 9);
        tree.insert(root, 0);
        tree.insert(root, 4);

        tree.inOrderTraversal(root);


    }

}
