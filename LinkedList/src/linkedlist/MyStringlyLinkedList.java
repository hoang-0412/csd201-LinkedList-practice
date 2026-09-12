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

//    3. Thêm node vào vị trí bất kỳ của list
    public void addByIndex(Person data, int i) {
        if (i <= 0) {
            addFirst(data);
            return;
        }

        int total = count();
        if (i >= total) {
            addLast(data);
            return;
        }

        Node p = head;
        for (int j = 0; j < i - 1; j++) {
            p = p.next;
        }
        Node newN = new Node(data, p.next);
        p.next = newN;
    }

//    4. Xóa node cuối list
    public void removeLast() {
        if (isEmpty()) {
            return;
        }

        if (head == null) {
            head = tail = null;
            return;
        }

        Node p = head;
        while (p.next != tail) {
            p = p.next;
        }
        p.next = null;
        tail = p;
    }

//    5. Xóa node đầu list
    public void removeFirst() {
        if (isEmpty()) {
            return;
        }

        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

//    6. Sắp xếp list theo trật tự tăng dần của info của các node
//    7. Sắp xếp list theo trật tự giảm dần của info của các node
//    8. Đảo ngược trật tự các node của list
//    9. Tìm và hiển thị vị trí của tất cả các node có age lớn nhất
//    10. Tìm và hiển thị vị trí của tất cả các node có age nhỏ nhất.
}
