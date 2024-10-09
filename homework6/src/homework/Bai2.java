package homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Bai2 {
    /*
    Bài 2: Cho mảng A[] gồm n số nguyê n khác nhau.
    Hãy đưa ra các phần tử của mảng theo khuôn dạng lớn nhất, nhỏ nhất, lớn thứ hai, nhỏ thứ 2, …
Mỗi bộ test gồm hai dòng:
Dòng đầu tiên là số phần tử của mảng n
Dòng tiếp theo là n (1 ≤ n ≤ 103) số A [i] của mảng A [].
Các số được viết cách nhau một vài khoảng trống.
Ví dụ: A[] = {9, 7, 12, 8, 6, 5} ⇒ 12, 5, 9, 6, 8, 7

     */
    public static void nhapArr(int [] a){
        Scanner sc =  new Scanner(System.in);
        for(int i = 0;i < a.length;i++){
            a[i] = sc.nextInt();
        }
    }
//    public static void inArr(int [] a){
//        for(int i = 0;i < a.length;i++){
//            System.out.printf("%d " , a[i]);
//        }
//    }

    //tao mang xu ly yeu cau de bai
    //A[] = {9, 7, 12, 8, 6, 5} ⇒ 12, 5, 9, 6, 8, 7
    public static void xulyArr(int [] a){
        Arrays.sort(a);
        int left = 0;
        int right = a.length - 1;
        while(left <= right){
            System.out.print(a[right] + " " + a[left]);
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] A = new int[size];
        nhapArr(A);
        xulyArr(A);
    }
}
