package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Khai bao mot mang gom row = 1000, col = 1000
        //ct tinh tam giac pascal dua theo ly thuyet to hop chinh hop:
        //kCn = (k - 1)C(n - 1) + kC(n -1)
        //cac cot index j = i va j = 0 se auto la gia tri 1
        //tinh cac cot khac theo ct: c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
        long c[][] = new long[1001][1001];
        for(int i = 0;i < c.length - 1;i++){
            for(int j = 0;j <= i;j++){
                if(j == i || j == 0){
                    c[i][j] = 1;
                }else{
                    c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //test case: n = 5
        //System.out.println(c[n][k]);
        System.out.print("[");
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= i;j++){
                System.out.print("[" + c[i][j] + "]");
            }
            if(i == n -1){
                System.out.print("");
            }else{
                System.out.print(",");
            }

        }
        System.out.print("]");
    }
}
