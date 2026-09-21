package myqueue;

public class LinkedListQueue {

    Node head, tail;

    public LinkedListQueue() {
        head = tail = null;
    }

    void clear() {
        head = tail = null;
    }

    boolean isEmpty() {
        return head == null && tail == null;
    }

    Object front() {
        if (isEmpty()) {
            return null;
        }

        return head.data;
    }

    Object dequeue() {
        if (isEmpty()) {
            return null;
        }

        Object x = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        return x;
    }

    void enqueue(Object data) {
        Node n = new Node(data);
        if (isEmpty()) {
            head = tail = new Node(data);
            return;
        }

        tail.next = n;
        tail = tail.next;
    }

}
