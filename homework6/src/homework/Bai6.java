package homework;

import java.util.Scanner;

public class Bai6 {
    /*
    Bài 6: có một con ốc sên dưới mặt đất. Nó muốn leo lên đỉnh một cái cột bằng gỗ với chiều cao V mét, tính từ mặt đất.
    Trong một ngày, nó có thể leo lên A mét, tuy nhiên, trong mỗi đêm nó ngủ, nó lại bị tụt xuống B mét.
    Xác định số ngày cần thiết để con ốc sên leo tới đỉnh.
Dữ liệu:
Ba số nguyên cách nhau bởi dấu cách: A,B và V (1≤B<A≤V≤1 000 000 000).
Kết quả:
Một số nguyên duy nhất là số ngày cần thiết để con ốc sên leo tới đỉnh
     */
    public static int solve(int v, int a, int b){
        int days = 0;
        if(a >= v){
            days = 1;
        }else{
            days = ((v - a) / (a - b));
            days += 1;
        }
        return days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int v = sc.nextInt();
            System.out.println(solve(v, a, b));
            --t;
        }
    }
}
