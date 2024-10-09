package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai1 {
    /*
    Bài 1: Bài toán yêu cầu các bạn liệt kê các giá trị xuất hiện trong mảng kèm theo số lần xuất hiện của nó.
     */
    public static void nhapArr(int [] a){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < a.length;i++){
            a[i] = sc.nextInt();
        }
    }
    //su dung hashmap<key,value> de luu lai gia tri gia tri a[i] vao phan key
    //phan value luu gia tri default = 0
    //dung containsKey() de kiem tra key da co trong map thi se tang phan value len 1 don vi
    public static void duplicateItem(int [] a){
        Map<Integer, Integer> duplicateArr = new HashMap<Integer, Integer>();
        for(int i = 0;i < a.length;i++){
            if(!duplicateArr.containsKey(a[i])){
                duplicateArr.put(a[i], 1);
            }else{
                duplicateArr.put(a[i], duplicateArr.get(a[i]) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : duplicateArr.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] x = new int [size];
        nhapArr(x);
        duplicateItem(x);
    }
}
