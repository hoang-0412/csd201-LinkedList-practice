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

//        Thực hiện tiếp các action sau cho SinglyLinkedList:
//        1. Đếm và trả về số node của list
//        2. Thêm node vào đầu list
//        3. Thêm node vào vị trí bất kỳ của list
//        4. Xóa node cuối list
//        5. Xóa node đầu list
//        6. Sắp xếp list theo trật tự tăng dần của info của các node
//        7. Sắp xếp list theo trật tự giảm dần của info của các node
//        8. Đảo ngược trật tự các node của list
//        9. Tìm và hiển thị vị trí của tất cả các node có age lớn nhất
//        10. Tìm và hiển thị vị trí của tất cả các node có age nhỏ nhất.
        System.out.println("\n1. Dem va tra ve so node cua list");
        System.out.println("So luong node trong list: " + MSLL.count());
        System.out.println("\n2. Them node vao dau list");
        System.out.println("Vi du them David age 25 vao dau list");
        MSLL.addFirst(new Person("David", 25));
        MSLL.traverse();
    }

}
