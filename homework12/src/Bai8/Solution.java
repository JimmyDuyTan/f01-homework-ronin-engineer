package Bai8;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public void isValid(String s){
        Map<Character, Character> mapping = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        mapping.put(')', '(');
        mapping.put(']' , '[');
        mapping.put('}' , '{');
        for(char c : s.toCharArray()){
            if(mapping.containsValue(c)){
                stack.push(c);
            }else if(mapping.containsKey(c)){
                if(stack.isEmpty() || mapping.get(c) != stack.pop()){
                    System.out.println("Bieu thuc khong hop le " + s);
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("Bieu thuc hop le " + s);
        }else{
            System.out.println("Bieu thuc khong hop le " + s);
        }
    }

}
