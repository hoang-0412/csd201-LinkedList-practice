package mystack;

public class ArrayStack {

    Object[] as;
    int top, max;

    public ArrayStack(int max) {
        this.max = max;
        as = new Object[max];
        top = -1;
    }

    public ArrayStack() {
        this(10);
    }

    void clear() {
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top + 1 == max;
    }

    Object top() {
        if (isEmpty()) {
            return null;
        }
        return as[top];
    }

    Object pop() {
        if (isEmpty()) {
            return null;
        }

        Object x = as[top];
        top--;
        return x;
    }

    boolean addCapcity() {
        int max1 = max + 5;
        Object[] as1 = new Object[max1];
        if (as1 == null) {
            return false;
        }

        for (int i = 0; i < max; i++) {
            as1[i] = as[i];
        }

        as = as1;
        max = max1;
        return true;
    }

    void push(Object data) {
        if (isFull() && !addCapcity()) {
            return;
        }

        as[top++] = data;
    }
}
