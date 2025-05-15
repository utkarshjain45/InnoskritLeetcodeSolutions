import java.util.*;

public class prblm1544 {

    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }

    public static String makeGood(String s) {
        Stack<Character> result = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(!result.isEmpty() && Math.abs(result.peek() - curr) == 32){
                result.pop();
            }
            else{
                result.push(curr);
            }
        }
        StringBuilder str = new StringBuilder();
        int size = result.size();
        for (int i = 0; i < size; i++) {
            str.append(result.pop());
            
        }
        return str.reverse().toString();
    }
}