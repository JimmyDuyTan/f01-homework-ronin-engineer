package bai5;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //testcase
        String s = "[()]{}{[()()]()}";
        System.out.println("Ket qua: " + solution.isValid(s));
    }
}
