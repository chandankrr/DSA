package linkedlist_10.singly.deletion.from_beginning;

public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            int data = d;
            next = null;
        }
    }

    void push(int newData) {
        Node newNode = new Node(newData);

        newNode.next = head;
        head.next = newNode;
    }



    public static void main(String[] args) {

    }

}
