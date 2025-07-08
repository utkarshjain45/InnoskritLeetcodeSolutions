import java.util.*;

public class prblm409 {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome2(s));
        
        String s1 = "ccc";
        System.out.println(longestPalindrome2(s1));
    }

    public static int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = 0;
        boolean hasOdd = false;

        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                count += freq;
            } else {
                count += freq - 1; 
                hasOdd = true;      
            }
        }

        if (hasOdd) count += 1;

        return count;
    }

    public static int longestPalindrome2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (map.get(ch) % 2 == 0) {
                count++;
            }else{
                count -= map.get(ch);
            }
        }
        return count;
    }
}
