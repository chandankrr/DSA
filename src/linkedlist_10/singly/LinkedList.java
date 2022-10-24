package linkedlist_10.singly;

public class LinkedList {
    Node head; // head of list

    // Linked list Node. This inner class is made static so that main() can access it
    static class Node {
        int data;
        Node next;

        // constructor
        Node (int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {

        // start with the empty list
        LinkedList llist = new LinkedList();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second; // link first node with the second node
        second.next = third; // link second node with the third node
    }
}
