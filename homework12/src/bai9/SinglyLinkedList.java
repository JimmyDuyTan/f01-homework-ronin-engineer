package bai9;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    //Constructor
    public SinglyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode; //tro ve newNode
        tail = newNode; //tro ve newNode, newNode to ve null
        length = 1;  //khoi tao linkedList thi length = 1
    }
    //Getter,Setter
    public int getHead(){
        return this.head.value;
    }
    public int getTail(){
        return this.tail.value;
    }
    public int getLength(){
        return this.length;
    }
    //print list
    public void printList(){
        Node tmp = head;
        while(tmp != null){ //tro den null thi break
            // 4 -> 14 -> 23 -> 16 -> 30
            System.out.println(tmp.value); //lay value cua tung Node
            tmp = tmp.next; //tro sang Node ke tiep
        }
    }
    //append Node
    public void append(int value){
        Node newNode = new Node(value); //tao ra node moi can them
        if(length == 0){ //neu List rong tro head + tail ve newNode
            head = newNode;
            tail = newNode;
        }else{
            //4 -> 14 -> 23 -> 16 -> 30, them node co value = 7 vao cuoi list
            //tail == 30 -> null => 30 -> 7 -> null (tail.next == 30 -> 7, tail == 7)
            tail.next = newNode;
            tail = newNode;
        }
        //trong th neu List rong hoac List da co phan tu khi insert them Node
        //can tang do dai List them 1 don vi trong ca 2 TH
        length++;
    }
    //prepend
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    //remove last
    public Node removeLast(){
        //Neu list = 0 khong co Node nao de xoa return null
        if(length == 0) return null;
        Node tmp = head;
        Node pre = head;
        //sau khi break loop
        //pre = length - 2, tmp = length - 1 va tmp tro den null
        //gan tail = pre va tro tail den null
        //khi nay tail da tro thanh node cuoi cung cua list
        //return lai tmp la Node da bi delete
        while(tmp.next != null){
            pre = tmp;
            tmp = tmp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        //neu List chi chua 1 Node va sau khi xoa list = 0
        //head , tail tro ve null
        if(length == 0){
            head = null;
            tail = null;
        }
        return tmp;
    }
    public Node removeFirst(){
        if(length == 0) return null;
        Node tmp = head;
        head = tmp.next;
        tmp.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return tmp;
    }
    //get index Node
    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node tmp = head;
        for(int i = 0; i < index;i++){
            tmp = tmp.next;
        }
        return tmp;
    }
    //set
    public boolean set(int index, int value){
        if(index < 0 || index >= length){
            return false;
        }
        Node tmp = head;
        for(int i = 0;i < index;i++){
            tmp = tmp.next;
        }
        tmp.value = value;
        return true;
    }
    //set 2
    public boolean set2(int index, int value){
        Node tmp = get(index);
        if(tmp != null){ //tmp is out of range always return null in method get()
            tmp.value = value;
            return true;
        }
        return false;
    }
    //insert
    public boolean insert(int index, int value){
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length - 1){
            append(value);
            return true;
        }
        if(index < 0 || index >= length){
            return false;
        }
        Node newNode = new Node(value);
        Node tmp = get(index - 1); //node lien sau
        newNode.next = tmp.next; //tro den Node ke tiep
        tmp.next = newNode; //tro Node tmp den Node newNode de ket noi 2 Node
        length++;
        return true;
    }
    //Remove
    public Node remove(int index){
        if(index < 0 || index >= length){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }
        if(index == length - 1){
            return removeLast();
        }
        Node tmp = get(index);
        Node prev = get(index - 1);
        prev.next = tmp.next;
        tmp.next = null;
        length--;
        return tmp;
    }
    //reverse
    public void reverse(){
        Node tmp = head;
        head = tail;
        tail = tmp;
        Node after = tmp.next;
        Node before = null;
        for(int i = 0;i < length;i++){
            after = tmp.next;
            tmp.next = before;
            before = tmp;
            tmp = after;
        }
    }
}
