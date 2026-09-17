package mystack;

public class TestArrayStack {

    public static void main(String[] args) {
        ArrayStack AS = new ArrayStack(5);
        System.out.println(AS.max);
        System.out.println(AS.isEmpty());
        System.out.println(AS.isFull());
       AS.push(10);
        System.out.println(AS.top());
    }
}
