import java.util.*;

public class prblm3 {
    public static void main(String[] args) {
       
    }
    public int lengthOfLongestSubstring(String s) {
        int windowStart=0;
        int maxlength=0;
        Map<Character, Integer> frequMap = new HashMap<>();

        for(int windowEnd=0; windowEnd< s.length(); windowEnd++){
         char ch = s.charAt(windowEnd);
         frequMap.put(ch, frequMap.getOrDefault(ch, 0) + 1);
         while (frequMap.size() != (windowEnd - windowStart + 1)) {
            char leftChar = s.charAt(windowStart);
            frequMap.put(leftChar,frequMap.get(leftChar) - 1);
            if (frequMap.get(leftChar) == 0) {
                frequMap.remove(leftChar);
            }
            windowStart += 1;
        }   
        maxlength = Math.max(maxlength, windowEnd - windowStart + 1);
        }
        return maxlength;
    }
}