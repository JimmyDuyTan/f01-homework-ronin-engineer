package bai3;

public class Main {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        for(int i = 0;i < 5;i++){
            ms.push(i);
        }
        ms.printStack();
        System.out.println("-------------------------");
        System.out.println(ms.pop());
        System.out.println(ms.top());
        System.out.println(ms.size());
        System.out.println("check empty 1 - empty, 0 - nonempty: " + ms.empty());
    }
}
