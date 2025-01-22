
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class p4 {

    static int kthelementsfromlast(Node head, int k) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }

    public static void main(String args[]) {
        Node head = new Node(5);
        head.next = new Node(7);
        head.next.next = new Node(9);
        head.next.next.next = new Node(3);
        System.out.println(kthelementsfromlast(head, 3));

    }
}
