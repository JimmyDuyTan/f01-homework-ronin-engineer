package homework;

public class Bai4 {
    /*
Bài 4: Bạn được cung cấp một mảng gồm n phần tử và một số k .
Bạn cần tìm số nguyên dương x nhỏ nhất sao cho có đúng k phần tử của mảng nhỏ hơn hoặc bằng x .
Nếu không có số x thỏa mãn hãy in ra “-1” .
Input
Dòng đầu tiên chứa một số nguyên n  và k ( 1 ≤  n ≤  2.105 , 0  ≤  k  ≤  n ).
Dòng thứ hai chứa n số nguyên a1 , a2 ,…. an (0  <  ai  ≤ 109 ) là các phần tử của mảng.
Output
In ra số nguyên dương x . Nếu không có số x thỏa mãn hãy in ra “-1”

     */

    public static int solve(int [] a,int k){
        //int min = a[0];
        for(int i = 0;i < a.length;i++){
            int cnt = 0;
            for(int j = 0;j < a.length;j++){
                if(a[i] >= a[j]){
                    ++cnt;
                }
            }
            if(cnt == k){
                return a[i];
            }else{
                continue;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] a = {3, 7 , 5, 1, 10, 3, 20};
        int k = 4;
        System.out.println(solve(a,k));
    }
}
