import java.util.*;

public class prblm1935 {
    public static void main(String[] args) {
        String text = "hello world", brokenLetters = "ad";
        System.out.println(new prblm1935().canBeTypedWords(text, brokenLetters));
    }

    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet<>();
        for (char ch : brokenLetters.toCharArray()) {
            set.add(ch);
        }   

        int ans = 0;
        String[] arr = text.split(" ");
        for (String str : arr) {
            boolean canTyped = true;
            for (char ch : str.toCharArray()) {
                if (set.contains(ch)) {
                    canTyped = false;
                    break; 
                }            
            }
            if (canTyped) {
                ans++;
            }
        }
        return ans;
    }
}
