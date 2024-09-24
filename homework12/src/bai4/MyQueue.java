package bai4;

import java.util.ArrayList;
/*
    1.Trả về kích thước của queue
    2.Kiểm tra xem queue có rỗng không, nếu có in ra “YES”, nếu không in ra “NO”.
    3.Cho một số nguyên và đẩy số nguyên này vào cuối queue.
    4.Loại bỏ phần tử ở đầu queue nếu queue không rỗng, nếu rỗng không cần thực hiện.
    5.Trả về phần tử ở đầu queue, nếu queue rỗng in ra -1.
    6.Trả về phần tử ở cuối queue, nếu queue rỗng in ra -1.
 */
public class MyQueue<T> {
    private ArrayList<T> queue;
    public MyQueue(){
        queue = new ArrayList<>();
    }
    //1.Trả về kích thước của queue
    public int size(){
        int length = 0;
        for(T item : queue){
            length++;
        }
        return length;
    }
    // 2.Kiểm tra xem queue có rỗng không, nếu có in ra “YES”, nếu không in ra “NO”.
    public void empty(){
        if(queue.isEmpty()){
            System.out.println("NO");
        }
        System.out.println("YES");
    }
    //3.Cho một số nguyên và đẩy số nguyên này vào cuối queue.
    public void push(T item){
        queue.add(item);
    }
    //4.Loại bỏ phần tử ở đầu queue nếu queue không rỗng, nếu rỗng không cần thực hiện.
    public void pop(){
        if(!queue.isEmpty()){
            queue.remove(0);
        }
    }
    //5.Trả về phần tử ở đầu queue, nếu queue rỗng in ra -1.
    public int getFirstItem(){
        if(!queue.isEmpty()){
            return (int) queue.get(0);
        }
        return -1;
    }
    //6.Trả về phần tử ở cuối queue, nếu queue rỗng in ra -1.
    public int getLastItem(){
        if(!queue.isEmpty()){
            return (int) queue.get(queue.size() - 1);
        }
        return -1;
    }
}
