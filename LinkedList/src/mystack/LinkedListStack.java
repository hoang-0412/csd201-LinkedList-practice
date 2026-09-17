package mystack;

import java.util.LinkedList;

public class LinkedListStack {

    LinkedList list;

    public LinkedListStack() {
        list = new LinkedList();
    }

    void clear() {
        list.clear();
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    Object top() {
        if (list.isEmpty()) {
            return null;
        }

        return list.getLast();
    }

    Object pop() {
        if (list.isEmpty()) {
            return null;
        }

        return list.removeLast();
    }

    void push(Object data) {
        list.addLast(data);
    }
}
