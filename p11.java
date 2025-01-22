
class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class p11 {

    static void printpostorder(Node node) {
        if (node == null) {
            return;
        }
        printpostorder(node.left);

        printpostorder(node.right);
        System.out.println(node.data);

    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(8);
        root.right = new Node(4);
        root.left.left = new Node(7);
        root.left.right = new Node(1);
        System.out.println("postorder traversal be");
        printpostorder(root);

    }

}
