import java.util.*;

public class prblm76 {
    public static void main(String[] args) {
        String s = "bbaa", t = "aba";
        System.out.println(new prblm76().minWindow(s, t));
    }

    public String minWindow(String s, String t) {
        int start = 0;
        Map<Character, Integer> targetMap = new HashMap<>();
        for(char ch : t.toCharArray()){
            targetMap.put(ch, targetMap.getOrDefault(ch, 0) + 1);
        }

        int formed = 0;
        Map<Character, Integer> map = new HashMap<>();
        int minLength = Integer.MAX_VALUE, startIndex = 0;

        for(int end = 0; end < s.length(); end++){
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if(targetMap.containsKey(ch) && targetMap.get(ch).intValue() == map.get(ch).intValue()){
                formed++;
            }

            while(formed == targetMap.size()){
                if(end - start + 1 < minLength){
                    minLength = end - start + 1;
                    startIndex = start;
                }

                char c = s.charAt(start);
                map.put(c, map.get(c) - 1);
                if(targetMap.containsKey(c) && map.get(c) < targetMap.get(c)){
                    formed--;
                }
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLength);
    }
}