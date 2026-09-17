package myqueue;

public class ArrayQueue {

    Object[] aq;
    int max;
    int first, last;

    public ArrayQueue(int max) {
        this.max = max;
        aq = new Object[max];
        first = last = -1;
    }

    public ArrayQueue() {
        this(10);
    }

    void clear() {
        first = -1;
    }

    boolean isEmpty() {
        return first == -1;
    }

    boolean isFull() {
        return first == 0 && last == max - 1;
    }

    Object front() {
        if (isEmpty()) {
            return null;
        }

        return aq[first];
    }

    Object dequeue() {
        if (isEmpty()) {
            return null;
        }

        Object x = aq[first];
        if (first == last) {
            first = last = -1;
        } else {
            first++;
        }
        return x;
    }

}
