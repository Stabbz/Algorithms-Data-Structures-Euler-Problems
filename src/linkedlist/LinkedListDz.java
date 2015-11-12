package linkedlist;

/**
 * Created by Damyan Damyanov <damyan.damyanov@scalefocus.com> on 11/11/15.
 */
public class LinkedListDz {

    public Node head;

    static class Node {
        Node prev;
        Node next;
        int value;

        Node(int val) {
            this.value = val;
        }
    }

    public void add(int val) {
        if (head == null) {
            head = new Node(val);
            System.out.println("New head appointed: " + val);
            return;
        }

        if (head.next == null) {
            head.next = new Node(val);
            head.next.prev = head;
            System.out.println("New tail appointed: " + val);
            return;
        }

        Node currentNode = head.next;
        Node prevNode = head;

        while (true) {
            if (currentNode.next != null) {
                currentNode = currentNode.next;
                prevNode = prevNode.next;
            } else {
                break;
            }
        }

        currentNode.next = new Node(val);
        currentNode.next.prev = prevNode;
        System.out.println("Added to tail: " + val);
    }

}
