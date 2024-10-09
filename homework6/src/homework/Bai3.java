package homework;

import java.util.Scanner;

public class Bai3 {
    /*
    Bài 3: Trộn 2 mảng đã sắp xếp thành một mảng cũng được sắp xếp
     */
    public static void nhapMang(int [] a){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
    }
    public static int[] mergeMang(int [] nums1, int [] nums2){
        int i = nums1.length - 1;
        int j = nums2.length - 1;
        int k = nums1.length + nums2.length - 1;
        int [] c = new int[nums1.length + nums2.length];
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                c[k--] = nums1[i--];
            }else{
                c[k--] = nums2[j--];
            }
        }
        if(i > 0){
            while(i >= 0){
                c[k--] = nums1[i--];
            }
        }
        if(j > 0){
            while(j >= 0){
                c[k--] = nums2[j--];
            }
        }
        return c;
    }

    public static void inMang(int [] a){
        for(int item : a){
            System.out.print(item + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [] a = new int[m];
        int [] b = new int[n];
        nhapMang(a);
        nhapMang(b);
        //test case: a = {1, 2, 3} , b = {2 , 5, 6}
        inMang(mergeMang(a, b));
    }
}
