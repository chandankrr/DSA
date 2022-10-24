package linkedlist_10.singly.insertion.Insert_node_at_specific_position;

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

    void push(int newData) {
        Node newNode = new Node(newData);

        newNode.next = head;
        head = newNode;
    }

    // Function to insert an element at a specified index
    Node insertNodeAtPosition(int position, int data) {
        if (position < 1) {
            System.out.println("Invalid position");
        }

        if (position == 1) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        } else {
            for (int i = 1; i < position - 1; i++) {
                head = head.next;
            }

            Node newNode = new Node(data);
            newNode.next = head.next;
            head.next = newNode;
        }

        return head;
    }

    void printList() {
        Node tnode = head;

        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.print("Linked list before insertion: ");
        llist.printList();

        int data = 10, pos = 2;
        llist.insertNodeAtPosition(pos, data);
        System.out.print("Linked list after insertion of 10 at position 2: ");
        llist.printList();
    }
}
