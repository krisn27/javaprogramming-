
class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class p10 {

    static void printinorder(Node node) {
        if (node == null) {
            return;
        }
        printinorder(node.left);
        System.out.println(node.data);

        printinorder(node.right);

    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(8);
        root.right = new Node(4);
        root.left.left = new Node(7);
        root.left.right = new Node(1);
        System.out.println("inorder traversal be");
        printinorder(root);

    }

}
