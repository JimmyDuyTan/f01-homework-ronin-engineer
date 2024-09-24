package bai10;

public class Node {
    int value;
    Node next;
    Node prev;
    Node(int value){
        this.value = value;
    }
    //Getter, Setter
    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value = value;
    }
}
