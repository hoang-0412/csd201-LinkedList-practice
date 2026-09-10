package linkedlist;

public class TestMyStringlyLinkedList {

    public static void main(String[] args) {
        MyStringlyLinkedList MSLL = new MyStringlyLinkedList();
        Person p = new Person("Alex", 10);
        MSLL.addLast(p);
        String[] names = {"Victoria", "John", "Anna", "Dinh Bac"};
        int[] ages = {19, 20, 21, 22};
        MSLL.addMany(names, ages);
        MSLL.traverse();
        if (MSLL.searchByName("Alex") == null) {
            System.out.println("Not found!");
        } else {
            System.out.println("Found!");
        }
        System.out.println(MSLL.isEmpty());
    }

}
