package bai3;

import java.util.LinkedList;
/*
-          1. ‘MyStack’ : Khởi tạo stack rỗng.
-          2. ‘push x’: Thêm phần tử x vào stack. (x là số nguyên dương không quá 10 mũ 9)
-          3. ‘pop’: Nếu stack không rỗng lấy ra phần tử ở đỉnh stack.
-          4. ‘top’: Trả về phần tử ở đỉnh stack. Nếu stack rỗng, trả về -1.
-          5. ‘size:’ Trả về kích thước stack (số phần tử hiện tại của stack).
-          6. ‘empty’: Kiểm tra stack rỗng hay không, nếu rỗng trả về 1, ngược lại là 0.
     */
public class MyStack1<T> {
    private LinkedList<T> list;
    //Constructor
    public MyStack1(){
        list = new LinkedList<>();
    }
    //method
    //them phan tu vao stack
    public void push(T item){
        list.add(item);
    }
    //xoa phan tu dinh cua stack
    public T pop(){
        if(list.isEmpty()){
            throw new IllegalStateException();
        }
        return list.removeFirst();
    }
    //tra ve phan tu dinh stack va khong xoa
    public T top(){
        if(list.isEmpty()){
            throw new IllegalStateException();
        }
        return list.peekFirst();
    }
    //tra ve size cua stack
    public int size(){
        int length = 0;
        for(T item : list){
            length++;
        }
        return length;
    }
    //check stack is empty or not
    public int empty(){
        int length = 0;
        for(T item : list){
            length++;
            return 1;
        }
        return 0;
    }
}
