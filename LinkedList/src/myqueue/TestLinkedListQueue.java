package myqueue;

public class TestLinkedListQueue {

    public static void main(String[] args) {
        LinkedListQueue llq = new LinkedListQueue();
        llq.enqueue(10);
        llq.enqueue(20);
        llq.enqueue(30);
        llq.enqueue(40);
        llq.dequeue();
        llq.clear();
        System.out.println(llq.front());
        System.out.println(llq.isEmpty());
    }

}
