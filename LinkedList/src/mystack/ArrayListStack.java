package mystack;

import java.util.ArrayList;

public class ArrayListStack {

    ArrayList als;

    public ArrayListStack() {
        als = new ArrayList();
    }

    void clear() {
        als.clear();
    }

    boolean isEmpty() {
        return als.isEmpty();
    }

    Object top() {
        if (als.isEmpty()) {
            return null;
        }

        return als.get(als.size() - 1);
    }

    Object pop() {
        if (als.isEmpty()) {
            return null;
        }

        return als.remove(als.size() - 1);
    }

    void push(Object data) {
        als.add(data);
    }
}
