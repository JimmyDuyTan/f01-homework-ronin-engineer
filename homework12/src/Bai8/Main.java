package Bai8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println("nhap so luong test case: ");
        int t = sc.nextInt(); //nhap sl testcase
        while(t > 0){
            System.out.println("Nhap bieu thuc: ");
            String s = sc.next(); //nhap bieu thuc
            solution.isValid(s); //kiem tra bieu thuc
            --t;
        }
    }
}
