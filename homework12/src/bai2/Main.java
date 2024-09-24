package bai2;

import java.util.Scanner;

public class Main {
    public static int[] plusOne(int [] x){
        int n = x.length;
        for(int i = n - 1;i >=0;i--){
            if(x[i] < 9){
                x[i]++;
                return x;
            }
            x[i] = 0;
        }
        // Nếu tất cả các chữ số đều là 9, tạo mảng mới
        int [] newNum = new int[n + 1];
        newNum[0] = 1;
        return newNum;
    }
    public static void nhapArr(int [] x, int n, Scanner sc){
        for(int i = 0;i < n;i++){
            x[i] = sc.nextInt();
        }
    }
    public static void inArr(int [] x){
        for(int i =0;i< x.length;i++){
            System.out.println(x[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //testcase 1
        // input: [1,2,3]
        //output:  [1,2,4]

        //testcase 2
        // input: [4,3,2,1]
        //output:  [4,3,2,2]

        //testcase 3
        // input: [9]
        //output:  [1, 0]
        int t = sc.nextInt(); // nhap so luong test case t = 3
        while(t > 0){
            int n = sc.nextInt();
            int [] a = new int[n];
            //nhap vao mang ban dau
            nhapArr(a, n,sc);
            inArr(a);
            //mang sau khi thay doi
            int [] result = plusOne(a);
            inArr(result);
            --t;
        }
    }
}
