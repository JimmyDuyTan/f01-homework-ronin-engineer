package baitapbuoi3;

import java.util.Scanner;

public class Bai3 {
    /*
    Cho hai số nguyên a, b. In ra màn hình tổng, hiệu, tích, thương của chúng.
    Lưu ý khi xử lý phép chia sẽ cần ép kiểu, kiểm tra mẫu khác 0.
    Xuất kết quả ra màn hình.
     */
    public static int sum(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static double divide(int a, int b){
        if(b != 0){
            return (double) a / b;
        }
        return (double) a / 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.printf("Tong %d + %d = %d ", x, y, sum(x,y));
        System.out.printf("Hieu %d + %d = %d ", x, y, subtract(x,y));
        System.out.printf("Tich %d + %d = %d ", x, y, multiply(x,y));
        System.out.printf("Thuong %d + %d = %g ", x, y, divide(x,y));
    }
}
