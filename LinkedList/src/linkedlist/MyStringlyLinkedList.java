package linkedlist;

public class MyStringlyLinkedList {

    Node head, tail;

    public MyStringlyLinkedList() {
        head = tail = null;
    }

    public void clear() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Person data) {
        Node n = new Node(data);
        if (isEmpty()) {
            head = tail = n;
            return;
        }
        tail.next = n;
        tail = n;
    }

    public void viewData(Node n) {
        if (n != null) {
            System.out.println(n.data);
        }
    }

    public void traverse() {
        if (isEmpty()) {
            return;
        }
        Node p = new Node();
        p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    public void addMany(String[] names, int[] ages) {
        for (int i = 0; i < names.length; i++) {
            Person p = new Person(names[i], ages[i]);
            addLast(p);
        }
    }

    public Node searchByName(String name) {
        Node p = head;
        while (p != null) {
            if (p.data.name.equals(name)) {
                return p;
            }
            p = p.next;
        }
        return null;
    }

//    1. Đếm và trả về số node của list
    public int count() {
        int count = 0;
        Node p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

//    2. Thêm node vào đầu list
    public void addFirst(Person data) {
        Node n = new Node(data, head);
        head = n;
        if (tail == null) {
            tail = head;
        }
    }
}
