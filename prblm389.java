import java.util.*;

public class prblm389 {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s, t));

        String s2 = "", t2 = "y";
        System.out.println(findTheDifference2(s2, t2));

        String s3 = "a", t3 = "aa";
        System.out.println(findTheDifference3(s3, t3));
    }

    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
            if (map.get(ch) < 0) {
                return ch;
            }
        }
        return ' ';
    }

    public static char findTheDifference2(String s, String t) {
        int[] arr = new int[26];
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            arr[ch - 'a']--;
            if (arr[ch - 'a'] < 0) {
                return ch;
            }
        }
        return ' ';
    }
    
    public static char findTheDifference3(String s, String t) {
        int count = 0;
        for (char ch : t.toCharArray()) {
            count += ch;
        }
        for (char ch : s.toCharArray()) {
            count -= ch;
        }
        return (char) count;
    }
}
