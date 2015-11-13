package linkedlist;

/**
 * Created by Damyan Damyanov <damyan.damyanov@scalefocus.com> on 11/11/15.
 */
public class LinkedListDz {

    public Node head;

    /**
     * Linked list node model.
     */
    public static class Node {
        public Node prev;
        public Node next;
        public int value;

        public Node(int val) {
            this.value = val;
        }
    }

    /**
     * Add element at end of list.
     */
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

    /**
     * Print out the elements of the list in order of their insertion (fifo).
     */
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value);
            if (temp.next == null) break;
            System.out.print(",");

            temp = temp.next;
        }
    }

    /**
     * Delete the head of the list and appoint a new head.
     */
    public void deleteFromHead() {
        if (head.next == null) {
            System.out.println("Deleting head node with value: " + head.value);
            head = null;
            return;
        }
        if (head.next.next == null) {
            System.out.println("Deleting head node with value: " + head.value);
            head.next.prev = null;
            head = head.next;
            head.next = null;
        } else {
            System.out.println("Deleting node with value: " + head.value);
            Node newHead = head.next;
            newHead.next = head.next.next;
            newHead.next.prev = newHead;
            newHead.prev = null;
            head = newHead;
        }
    }

    /**
     * Add element at head of list.
     */
    public void addToHead(int val) {
        if (head == null) {
            head = new Node(val);
            System.out.println("New list with head: " + val + " created.");
        } else {
            Node tail = head;
            tail.prev = new Node(val);
            tail.prev.next = tail;
            head = tail.prev;
            System.out.println("Added new head: " + val);
        }
    }

}
