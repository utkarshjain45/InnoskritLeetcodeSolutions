import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class prblm438 {
    public static void main(String[] args) {
        String s2 = "cbaebabacd", s1 = "abc";
        System.out.println(findAnagrams(s2, s1));
    }
    
    public static List<Integer> findAnagrams(String s2, String s1) {
        List<Integer> answer = new ArrayList<>();
        Map<Character,Integer> fMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            fMap.put(ch, fMap.getOrDefault(ch,0) + 1);
        }

        int wStart=0;
        int matched=0;
        for (int wEnd = 0; wEnd < s2.length(); wEnd++) {
            char ch = s2.charAt(wEnd);
            if (fMap.containsKey(ch)) {
                fMap.put(ch,fMap.get(ch)-1);
                if (fMap.get(ch) == 0) {
                    matched += 1;
                }
            }

            if (matched == fMap.size()) {
                answer.add(wStart);
            }

            if(wEnd >= s1.length() - 1){
                char leftChar = s2.charAt(wStart);
                wStart += 1;    
                if (fMap.containsKey(leftChar)) {
                    if(fMap.get(leftChar) == 0){
                        matched -= 1;
                    }
                    fMap.put(leftChar, fMap.get(leftChar)+1);
                }
            }
        }
        return answer;
    }
}
