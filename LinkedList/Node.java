public class Node {
    Node head;
    Node next;
    int val;

    public Node(int val) {
        this.head = head;
        this.val = val;
    }

    public void insert(int val) {
        Node n = new Node(val);
        head.next = n;
        head = n;
    }

}