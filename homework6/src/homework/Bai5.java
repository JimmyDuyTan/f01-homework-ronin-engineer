package homework;

import java.util.Scanner;

public class Bai5 {
    /*
    Bài 5: Bộ phim “Fast And Furious 9” vừa được phát hành! Hiện tại có N khách hàng đang đứng xếp hàng để mua vé.
     Mỗi người trong số họ có 1 đúng tờ tiền mệnh giá 25k hoặc 50k hoặc 100k. Okami là nhân viên bán vè ở rạp chiếu phim CGV.
     Do sơ suất nên anh ta đã quên mất mã két nên không có tiền để trả lại khách.
Hỏi: Okami có thể bán vé cho mỗi khách hàng theo đúng thứ tự hay không (giá 1 vé “Fast and Furious 9” là 25k) ?
Input
-     	Dòng đầu tiên ghi 1 số nguyên N (1 <= N <= 10^6).
-     	Dòng thứ 2 ghi N số nguyên có giá trị 25 hoặc 50 hoặc 100.
Output
-     	Nếu Okami có thể bán vẻ cho mỗi khách hàng theo đúng thứ tự thì in ra “YES” và ngược lại thì in ra “NO”.
     */
    public static void checkSales(int [] x){
        int tmp = 0;
        //neu x[i] = 25 thi k phai thoi tien, tmp += 1
        //neu x[i] = 50 thi phai thoi 25k , tmp -= 1
        //neu x[i] = 100 thi phai thoi 25k + 50k, do 50k = tmp - 1 => x[i] = 100k = tmp - 2
        for(int i = 0;i < x.length;i++){
            if(x[i] == 25){
                tmp += 1;
            }else if(x[i] == 50){
                tmp -= 1;
            }else{
                tmp -= 2;
            }
        }
        if(tmp < 0){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }

    public static void nhapMang(int [] x){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < x.length;i++){
            x[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //nhap sl test case
        while(t > 0){
            int size = sc.nextInt();
            int [] a= new int[size];
            nhapMang(a);
            checkSales(a);
            --t;
        }
    }
}
