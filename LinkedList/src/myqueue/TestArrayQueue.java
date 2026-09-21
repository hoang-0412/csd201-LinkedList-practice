package myqueue;

public class TestArrayQueue {

    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue(5);
        aq.enqueue(10);
        aq.enqueue(20);
        aq.enqueue(30);
        aq.enqueue(40);
        aq.enqueue(50);
        aq.enqueue(60);
        aq.dequeue();
        aq.clear();
        System.out.println(aq.front());
        System.out.println(aq.isFull());
        System.out.println(aq.isEmpty());
        System.out.println(aq.max);
    }

}
