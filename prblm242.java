import java.util.*;

public class prblm242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
        
        String s1 = "rat";
        String t1 = "car";
        System.out.println(isAnagram(s1, t1));
    
        String s2 = "ab";
        String t2 = "a";
        System.out.println(isAnagram2(s2, t2));

        String s3 = "aacc";
        String t3 = "ccac";
        System.out.println(isAnagram2(s3, t3));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }
        // System.out.println(sMap);
        for (Character ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }
        // System.out.println(tMap);
        return sMap.equals(tMap);
    }
    public static boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
