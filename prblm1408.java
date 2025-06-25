import java.util.*;

public class prblm1408 {
    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        List<String> ans = stringMatching(words);
        System.out.println(ans);
        
        String[] words2 = {"leetcoder","leetcode","od","hamlet","am"};
        List<String> ans2 = stringMatching2(words2);
        System.out.println(ans2);
    }
    
    public static List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (!words[i].equals(words[j])) {
                    if (words[j].contains(words[i])) {
                        if (!ans.contains(words[i])) {
                            ans.add(words[i]);
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static List<String> stringMatching2(String[] words) {
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(i != j && words[j].contains(words[i])){    
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }
}
