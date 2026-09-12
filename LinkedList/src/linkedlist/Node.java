package linkedlist;

public class Node {

    Person data;
    Node next;

    public Node() {
    }

    public Node(Person data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(Person data) {
        this(data, null);
    }
}
