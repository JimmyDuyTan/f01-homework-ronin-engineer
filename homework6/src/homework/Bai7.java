package homework;

import java.util.Scanner;

public class Bai7 {
    /*
    Bài 7: Một ngày Gấu muốn đếm lại xem hiện tại mình đang có bao nhiêu đôi giày. Sau khi kiểm tra,
     Gấu có n chiếc giày màu đỏ và m chiếc giày màu xanh.
Hiện tại Gấu đang theo mốt là mỗi ngày, gấu đeo một chiếc giày màu đỏ sang bên chân trái, chân phải thì đeo chiếc giày màu xanh.
Gấu ngại giặt giày nên sau mỗi ngày, Gấu không đeo lại giày mà hôm đó đã dùng.
Các bạn giúp Gấu xem là Gấu theo mốt này được bao nhiêu lâu.
Sau đó, khi không thực hiện mốt này được nữa thì Gấu sẽ đeo 2 đôi giày cùng màu thì Gấu sẽ có giày đeo được bao nhiêu ngày tiếp theo.
Input
Một dòng duy nhất chứa 2 số nguyên n, m (1 <= n, m <= 100) là số lượng giày màu đỏ và số lượng giày màu xanh.
Output
Gồm 2 số nguyên lần lượt là số ngày Gấu đi mỗi bên một màu và số ngày tiếp theo Gấu đi 2 bên màu giống nhau.
     */
    public static void solve(int m, int n){
        int theoMode, khongTheoMode;
        khongTheoMode = Math.abs((m - n) / 2);
        theoMode = ((m + n) - (khongTheoMode * 2)) / 2;
        System.out.println(theoMode + " " + khongTheoMode);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // so luong test
        while(t > 0){
            int m = sc.nextInt() , n = sc.nextInt();
            solve(m,n);
            --t;
        }
    }
}
