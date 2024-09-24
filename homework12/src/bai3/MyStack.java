package bai3;

import java.util.ArrayList;

/*
-          1. ‘MyStack’ : Khởi tạo stack rỗng.
-          2. ‘push x’: Thêm phần tử x vào stack. (x là số nguyên dương không quá 10 mũ 9)
-          3. ‘pop’: Nếu stack không rỗng lấy ra phần tử ở đỉnh stack.
-          4. ‘top’: Trả về phần tử ở đỉnh stack. Nếu stack rỗng, trả về -1.
-          5. ‘size:’ Trả về kích thước stack (số phần tử hiện tại của stack).
-          6. ‘empty’: Kiểm tra stack rỗng hay không, nếu rỗng trả về 1, ngược lại là 0.
     */
public class MyStack {
    private ArrayList<Integer> data;
    //Constructor
    public MyStack(){
        data = new ArrayList<>();
    }

    //Method
    public void printStack(){
        for(int item : data){
            System.out.println(item);
        }
    }
    public void push(int item){
        data.add(item);
    }
    public int pop(){
        if(data.isEmpty()){
            throw new IllegalStateException("Stack's empty");
        }
        return data.remove(data.size() - 1);
    }
    public int top(){
        if(data.isEmpty()){
            return -1;
        }else{
            return data.get(data.size() - 1);
        }
    }
    public int size(){
        int length = 0;
        for(int item : data){
            length++;
        }
        return length;
    }
    public int empty(){
        int cnt = 0;
        for(int item : data){
            cnt++;
            if(cnt > 0){
                return 1;
            }
        }
        return 0;
    }
}
