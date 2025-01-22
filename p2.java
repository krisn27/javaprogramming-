
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class p2 {

    static int middle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    public static void main(String args[]) {
        Node head = new Node(4);
        head.next = new Node(7);
        head.next.next = new Node(19);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(21);
        System.out.println(middle(head));

    }
}
