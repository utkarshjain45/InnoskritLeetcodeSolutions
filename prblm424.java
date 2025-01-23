import java.util.*;

public class prblm424 {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }
    public static int characterReplacement(String s, int k) {
        int wStart=0;
        int maxLength=0;
        int maxFrequency=0;
        Map<Character, Integer> fMap = new HashMap<>();

        for(int wEnd=0; wEnd<s.length(); wEnd++){
            char ch = s.charAt(wEnd);
            fMap.put(ch, fMap.getOrDefault(ch, 0) + 1);
            maxFrequency = Math.max(maxFrequency, fMap.get(ch));

            while(wEnd - wStart + 1 - maxFrequency > k){
                char leftChar = s.charAt(wStart);
                fMap.put(leftChar, fMap.get(leftChar) - 1);
                wStart += 1;
            }
            maxLength = Math.max(maxLength, wEnd - wStart + 1);
        }
        return maxLength;
    }
}
