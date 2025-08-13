import java.util.*;

public class prblm1048 {

    public static void main(String[] args) {
        String[] words = {"a","b","ba","bca","bda","bdca"};
        System.out.println(new prblm1048().longestStrChain(words));
        
        String[] words2 = {"xbc","pcxbcf","xb","cxbc","pcxbc"};
        System.out.println(new prblm1048().longestStrChain(words2));
    }

    public int longestStrChain(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        Map<String, Integer> map = new HashMap<>();
        int max = 0;

        for (String word : words) {
            map.put(word, 1);
            for (int i = 0; i < word.length(); i++) {
                String prev = word.substring(0, i) + word.substring(i + 1);
                if (map.containsKey(prev)) {
                    map.put(word, Math.max(map.get(word), map.get(prev) + 1));
                }
            }
            System.out.println(map);
            max = Math.max(max, map.get(word));
        }
        return max;
    }
}