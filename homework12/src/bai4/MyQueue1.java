package bai4;

import java.util.LinkedList;
/*
    1.Trả về kích thước của queue
    2.Kiểm tra xem queue có rỗng không, nếu có in ra “YES”, nếu không in ra “NO”.
    3.Cho một số nguyên và đẩy số nguyên này vào cuối queue.
    4.Loại bỏ phần tử ở đầu queue nếu queue không rỗng, nếu rỗng không cần thực hiện.
    5.Trả về phần tử ở đầu queue, nếu queue rỗng in ra -1.
    6.Trả về phần tử ở cuối queue, nếu queue rỗng in ra -1.
 */
public class MyQueue1<T> {
    private LinkedList<T> queue;
    public MyQueue1(){
        queue = new LinkedList<>();
    }
    //1.Trả về kích thước của queue
    public int size(){
        int length = 0;
        for(T item : queue){
            length++;
        }
        return length;
    }
    //2.Kiểm tra xem queue có rỗng không, nếu có in ra “YES”, nếu không in ra “NO”.
    public void isEmpty(){
        int length = 0;
        for(T item : queue){
            length++;
        }
        if(length != 0){
            System.out.println("YES");
        }
        System.out.println("NO");
    }
    //3.Cho một số nguyên và đẩy số nguyên này vào cuối queue.
    
}
