package mystack;

public class TestArrayStack {

    public static void main(String[] args) {
        ArrayStack AS = new ArrayStack(5);
        AS.push(10);
        AS.push(20);
        AS.push(30);
        AS.push(40);
        AS.push(50);
        AS.push(60);
        AS.pop();
        System.out.println(AS.top());
        System.out.println(AS.isFull());
        AS.clear();
        System.out.println(AS.isEmpty());
        System.out.println(AS.max);
    }
}
