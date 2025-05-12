import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class prblm1081 {
    public String smallestSubsequence(String s) {
        Map<Character, Integer> lastIndex = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            lastIndex.put(curr, i);
        }

        Stack<Character> stack = new Stack<>();
        Set<Character> seen = new HashSet<>(); 

        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(seen.contains(curr)) continue;
            while(!stack.isEmpty() && stack.peek() > curr && lastIndex.get(stack.peek()) > i) {
                seen.remove(stack.pop());
            }
            if(!seen.contains(curr)) {
                stack.push(curr);
                seen.add(curr);
            }
        }

        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()) {
            str.append(stack.pop());
        }

        return str.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(new prblm1081().smallestSubsequence(s));
    }
}
