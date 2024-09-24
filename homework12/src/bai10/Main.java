package bai10;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList(3);
        linkedList.append(10);
        linkedList.append(14);
        linkedList.append(2);
        linkedList.prepend(30);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.printList1();
//        linkedList.printList2();
    }
}
