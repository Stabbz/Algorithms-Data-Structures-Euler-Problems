import bst.BinarySearchTree;
import linkedlist.LinkedListDz;

/**
 * Created by Damyan Damyanov <damyan.damyanov@scalefocus.com> on 11/11/15.
 */
public class Main {

    public static void main(String[] args) {

        LinkedListDz list = new LinkedListDz();

        BinarySearchTree tree = new BinarySearchTree();

        list.addToHead(32);
        list.add(5);
        list.add(3);
        list.add(78);
        list.add(783);
        list.add(78321);
        list.addToHead(33);
        list.addToHead(90);
        list.printList();
        list.deleteFromHead();
        list.deleteFromHead();
        list.printList();

    }

}

