package linkedlist_10.singly.insertion;

public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* This function is in LinkedList class. Inserts a new Node at front of the list. This method is defined inside
    LinkedList class show above */
    // time complexity: O(1), auxiliary space: O(1)
    void push(int newData) {
        // Allocate the Node & put in the data
        Node newNode = new Node(newData);

        // Make next of new Node as head
        newNode.next = head;

        // Move the head to point to new Node
        head = newNode;
    }

    /* This function is in LinkedList class. Inserts a new node after the given prev_node. This method is defined
    inside LinkedList class */
    // time complexity: O(n), auxiliary space: O(1)
    void insertAfter(Node prevNode, int newData) {
        // Checked if the given Node is null
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        // Allocate the Node & put in the data
        Node newNode = new Node(newData);

        // Make next of newNode as next of prevNode
        newNode.next = prevNode.next;

        // Make next of prevNode as newNode
        prevNode.next = newNode;
    }

    /* Appends a new node at the end.  This method is defined inside LinkedList class */
    // time complexity: O(n), auxiliary space: O(1)
    public void append(int newData) {
        // Allocate the Node & put in the data
        Node newNode = new Node(newData);

        // If the Linked List is empty, then make the new node as head
        if (head == null){
            head = new Node(newData);
            return;
        }

        // This new node is going to be the last node, so make next of it as null
        newNode.next = null;

        // Else traverse till the last node
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }

        // Change the next of last node
        last.next = newNode;
        return;
    }

    /* print method */
    public void printList() {
        Node tnode = head;

        while(tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.append(6);
        llist.push(7);
        llist.push(1);
        llist.append(4);
        llist.insertAfter(llist.head.next, 10);

        System.out.println("\nCreated Linked list is: ");
        llist.printList();
    }
}
