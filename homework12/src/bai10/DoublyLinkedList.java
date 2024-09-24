package bai10;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1; //khoi tao List co san 1 Node => length = 1
    }
    //Getter, Setter
    public int getHead(){
        return this.head.value;
    }
    public void setHead(int value){
        this.head.value = value;
    }
    public int getTail(){
        return this.tail.value;
    }
    public void setTail(int value){
        this.tail.value = value;
    }
    public int getLength(){
        return this.length;
    }
    //Method
    //print List
    public void printList1(){
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }
    public void printList2(){
        Node tmp = tail;
        int size = this.length;
        while(size > 0){
            System.out.println(tmp.value);
            tmp = tmp.prev;
            size--;
        }
    }

    //append
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }
    //remove last
    public Node removeLast(){
        if(length == 0) return null;
        Node tmp = head;
        Node pre = head;
        while(tmp.next != null){
            pre = tmp;
            tmp = tmp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return tmp;
    }
    //prepend
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        length++;
    }
    //removeFirst
    public Node removeFirst(){
        if(length == 0) return null;
        Node tmp = head;
        head = tmp.next;
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
}
