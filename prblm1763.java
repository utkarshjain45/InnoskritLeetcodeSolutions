import java.util.*;

public class prblm1763 {
    public static void main(String[] args) {
        String s = "YazaAay";
        System.out.println(new prblm1763().longestNiceSubstring(s));   
    }

    public String longestNiceSubstring(String s) {
        int k = -1, max = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                set.add(s.charAt(j));
                boolean ok = true;
                for (char ch : set) {
                    char b = (char) (ch ^ 32);
                    if (!(set.contains(ch) && set.contains(b))) {
                        ok = false;
                        break;
                    }
                }
                if (ok && max < j - i + 1) {
                    max = j - i + 1;
                    k = i;
                }
            }
        }
        return k == -1 ? "" : s.substring(k, k + max);
    }
}
