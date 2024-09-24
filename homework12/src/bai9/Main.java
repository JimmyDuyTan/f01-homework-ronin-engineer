package bai9;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList(4);
        linkedList.append(7);
        linkedList.append(11);
        linkedList.append(14);
        linkedList.prepend(5);
        linkedList.remove(2);
        linkedList.get(1);

        linkedList.insert(1, 10);
        linkedList.set(1, 20);
        linkedList.set2(2, 30);
        linkedList.insert(3, 25);
        System.out.println("Item Last bi xoa " + linkedList.removeLast());
        System.out.println("Item First bi xoa " + linkedList.removeFirst());
        System.out.println("Print all item");
        linkedList.printList();
    }
}
