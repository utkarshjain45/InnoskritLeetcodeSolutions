import java.util.*;

public class prblm402 {
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println(removeKdigits(num, k));
    }

    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < num.length(); i++){
            char number = num.charAt(i);

            while(!stack.isEmpty() && stack.peek() > number && k > 0){
                stack.pop();
                k--;
            }
            stack.push(number);
        }

        while(k > 0){
            stack.pop();
            k--;
        }
        StringBuilder s = new StringBuilder();
        while(!stack.isEmpty()){
            s.append(stack.pop());
        }
        s.reverse();

        int startIndex = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '0'){
                startIndex = i;
                break;
            }
        }
        
        if(startIndex == -1){
            return "0";
        }

        return s.substring(startIndex);
    }
}
