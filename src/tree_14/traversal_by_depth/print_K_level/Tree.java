package tree_14.traversal_by_depth.print_K_level;

class Node {
    int key;
    Node left;
    Node right;

    Node(int key) {
        this.key = key;
    }

    void printKDistance(Node root, int k) {
        if (root == null)
            return;

        if (k == 0) {
            System.out.println(root.key + " ");
        } else {
            printKDistance(root.left, k - 1);
            printKDistance(root.right, k - 1);
        }
    }
}

public class Tree {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);

        root.printKDistance(root, 2);
    }
}
