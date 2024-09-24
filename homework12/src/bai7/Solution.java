package bai7;

import java.util.Stack;

public class Solution {
    //method
    public void decimalToBinary(int x){
        StringBuilder sb = new StringBuilder();
        Stack <Integer> s = new Stack<>();
        while(x > 0){
            s.push(x % 2);
            x /= 2;
            System.out.println(x);
        }
        for(int item : s){
            System.out.println(item);
        }
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        System.out.println("Result " + sb.toString());
    }
}
