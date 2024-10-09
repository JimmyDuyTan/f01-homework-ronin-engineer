package homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai8 {
    public static int solve(int s1, int s2, int s3, int s4){
        Set<Integer> pencilColours = new HashSet<Integer>();
        pencilColours.add(s1);
        pencilColours.add(s2);
        pencilColours.add(s3);
        pencilColours.add(s4);
        int distinctColours = pencilColours.size();
        int result = 4 - distinctColours;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int s1 = sc.nextInt(), s2 = sc.nextInt(), s3 = sc.nextInt(), s4 = sc.nextInt();
            System.out.println(solve(s1, s2, s3, s4));
            --t;
        }
    }
}
