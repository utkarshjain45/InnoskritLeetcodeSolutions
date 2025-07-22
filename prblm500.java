import java.util.*;

public class prblm500 {
    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(new prblm500().findWords(words)));
        
        String[] words2 = {"omk"};
        System.out.println(Arrays.toString(new prblm500().findWords(words2)));
        
        String[] words3 = {"adsdf","sfd"};
        System.out.println(Arrays.toString(new prblm500().findWords(words3)));
    }

    public String[] findWords(String[] words) {
        Set<Character> first = new HashSet<>();
        for (char ch : "qwertyuiopQWERTYUIOP".toCharArray()) {
            first.add(ch);
        }
        Set<Character> second = new HashSet<>();
        for (char ch : "asdfghjklASDFGHJKL".toCharArray()) {
            second.add(ch);
        }
        Set<Character> third = new HashSet<>();
        for (char ch : "zxcvbnmZXCVBNM".toCharArray()) {
            third.add(ch);
        }

        List<String> ans = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            char toCheck = words[i].charAt(0);
            boolean contains = true;
            if (first.contains(toCheck)) {
                for (char check : words[i].toCharArray()) {
                    if (!first.contains(check)) {
                        contains = false;
                        break;
                    }
                }
                if (contains) ans.add(words[i]);
            }
            else if (second.contains(toCheck)) {
                for (char check : words[i].toCharArray()) {
                    if (!second.contains(check)) {
                        contains = false;
                        break;
                    }
                }
                if (contains) ans.add(words[i]);
            }
            else if (third.contains(toCheck)) {
                for (char check : words[i].toCharArray()) {
                    if (!third.contains(check)) {
                        contains = false;
                        break;
                    }
                }
                if (contains) ans.add(words[i]);
            }
        }
        return ans.toArray(new String[0]);
    }
}
