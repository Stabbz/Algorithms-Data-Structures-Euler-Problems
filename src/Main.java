import bst.BinarySearchTree;
import linkedlist.LinkedListDz;

import java.util.TreeMap;

/**
 * Created by Damyan Damyanov <damyan.damyanov@scalefocus.com> on 11/11/15.
 */
public class Main {

    public static void main(String[] args) {

        LinkedListDz list = new LinkedListDz();

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(1);
        tree.insert(7);
        tree.insert(9);
        tree.insert(0);
        tree.insert(4);

        tree.printInorder();
    }

}

