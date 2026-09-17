package mystack;

public class TestArrayListStack {

    public static void main(String[] args) {
        ArrayListStack als = new ArrayListStack();
        als.push(10);
        als.push(20);
        als.push(30);
        als.pop();
        als.clear();
        System.out.println(als.top());
        System.out.println(als.isEmpty());
    }

}
