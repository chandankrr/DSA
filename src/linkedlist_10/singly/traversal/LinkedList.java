package linkedlist_10.singly.traversal;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // iterative traversal
    void printList() {
        Node n = head;

        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    // recursive traversal
    void printListRecursive(Node head) {
        if (head == null)
            return;

        System.out.print(head.data + " ");
        printListRecursive(head.next);
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;
        second.next = third;

        // function call
        llist.printList();

        /* System.out.println();
        llist.printListRecursive(llist.head); */
    }
}
