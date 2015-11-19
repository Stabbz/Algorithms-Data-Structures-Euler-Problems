package linkedlist;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Damyan Damyanov <damyan.damyanov@scalefocus.com> on 11/11/15.
 */
public class LinkedListDz {

    public Node head;
    public int size = 0;
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
            size += 1;
            System.out.println("New list with head: " + val + " created.");
            return;
        }

        if (head.next == null) {
            head.next = new Node(val);
            size += 1;
            head.next.prev = head;
            System.out.println("New tail appointed: " + val);
            return;
        }

        Node currentNode = head.next;

        while (true) {
            if (currentNode.next != null) {
                currentNode = currentNode.next;
            } else {
                break;
            }
        }

        currentNode.next = new Node(val);
        size += 1;
        currentNode.next.prev = currentNode;
        System.out.println("Added to tail: " + val);
    }

    /**
     * Delete element from the end of the list.
     */
    public void pop(){

        if (size < 2) {
            head = null;
            size = 0;
        } else {

            Node currentNode = head;

            while (true) {
                if (currentNode.next != null) {
                    currentNode = currentNode.next;
                } else {
                    break;
                }
            }

            currentNode.prev.next = null;
            currentNode.prev = null;
            size = size - 1;
        }
    }

    /**
     * Print out the elements of the list in order of their insertion (fifo).
     */
    public void printList() {
        if(head == null){
            System.out.println("List is empty!");
        }
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
        if(head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            System.out.println("Deleting head node with value: " + head.value);
            head = null;
            size -= 1;
            return;
        }
        if (head.next.next == null) {
            System.out.println("Deleting head node with value: " + head.value);
            head.next.prev = null;
            head = head.next;
            head.next = null;
            size -= 1;
        } else {
            System.out.println("Deleting head node with value: " + head.value);
            Node newHead = head.next;
            newHead.next = head.next.next;
            newHead.next.prev = newHead;
            newHead.prev = null;
            head = newHead;
            size -= 1;
        }
    }

    /**
     * Add element at head of list.
     */
    public void addToHead(int val) {
        if (head == null) {
            head = new Node(val);
            size += 1;
            System.out.println("New list with head: " + val + " created.");
        } else {
            Node tail = head;
            tail.prev = new Node(val);
            tail.prev.next = tail;
            head = tail.prev;
            size += 1;
            System.out.println("Added new head: " + val);
        }
    }

    /**
     * Insert element at the middle of the list.
     * (Only traversing the list once)
     */
    public void insertAtMiddle(int val) {
        if (head == null) {
            head = new Node(val);
            size += 1;
            System.out.println("New list with head: " + val + " created.");
            return;
        }
        // if there is only one element in the list, add as tail.
        if (head.next == null) {
            add(val);
            return;
        }
        // if there are only 2 elements in the list, add in between them.
        if (head.next.next == null) {
            Node temp = head.next;
            head.next = new Node(val);
            System.out.println("Added element: " + val + " at middle of list.");
            size += 1;
            head.next.prev = head;
            head.next.next = temp;
            head.next.next.prev = head.next;
            return;
        }

        Node middleElement = getMiddleElement();

        // inserting node after the found middle element
        System.out.println("We are at node: " + middleElement.value);
        Node newNode = new Node(val);
        size += 1;
        newNode.prev = middleElement;
        newNode.next = middleElement.next;
        middleElement.next.prev = newNode;
        middleElement.next = newNode;
        System.out.println("Added element: " + val + " at middle of list.");
    }

    /**
     * Delete the element that's in the middle of the list.
     * (Only traversing the list once)
     */
    public void deleteMiddleElement(){
        // delete nothing(exit the method) if list has 2 or less elements.
        if(size <= 2){
            System.out.println("List has only 2 elements or less! Nothing was deleted!");
            return;
        }
        Node middleElement;
        if(size % 2 == 0) {
            middleElement = getMiddleElement().next;
        } else {
            middleElement = getMiddleElement();
        }
        middleElement.prev.next = middleElement.next;
        middleElement.next.prev = middleElement.prev;
        size -= 1;
        System.out.println(middleElement.value + " was deleted!");
    }

    /**
     * Get the element that is in the middle of the list.
     * (Only traversing the list once)
     */
    public Node getMiddleElement(){
        Node singleJumpNode = head;
        Node doubleJumpNode = head;

        // traversing the list to get to the middle element.
        while (true) {
            singleJumpNode = singleJumpNode.next;
            doubleJumpNode = doubleJumpNode.next.next;
            if (doubleJumpNode.next == null || doubleJumpNode.next.next == null) {
                break;
            }
        }
        return singleJumpNode;
    }


}
