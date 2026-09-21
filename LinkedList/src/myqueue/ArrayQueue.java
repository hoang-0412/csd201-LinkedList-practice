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
        first = last = -1;
    }

    boolean isEmpty() {
        return first == -1;
    }

    boolean isFull() {
        return (first == 0 && last == max - 1) || (last + 1 == first);
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
        } else if (first == max - 1) {
            first = 0;
        } else {
            first++;
        }
        return x;
    }

    boolean addCapacity() {
        int max1 = max + 5;
        Object[] aq1 = new Object[max1];
        if (aq1 == null) {
            return false;
        }

        if (first <= last) {
            for (int i = first; i <= last; i++) {
                aq1[i - first] = aq[i];
            }
        } else {
            for (int i = first; i < max; i++) {
                aq1[i - first] = aq[i];
            }

            for (int j = 0; j <= last; j++) {
                aq1[max - first + j] = aq[j];
            }
        }
        aq = aq1;
        first = 0;
        last = max - 1;
        max = max1;
        return true;
    }

    void enqueue(Object data) {
        if (isFull() && !addCapacity()) {
            return;
        }

        if (last == -1 || last == max - 1) {
            aq[0] = data;
            last = 0;

            if (first == -1) {
                first = 0;
            }
        } else {
            aq[++last] = data;
        }
    }

}
