package tree_14.traversal_by_depth.postorder;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }

    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
        }
    }
}

public class Tree {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        System.out.print("Postorder: ");
        root.postorder(root);
    }
}
