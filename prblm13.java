import java.util.*;

public class prblm13 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        String cs = "IVXLCDM";
        int[] vs = {1, 5, 10, 50, 100, 500, 1000};
        Map<Character, Integer> d = new HashMap<>();
        for (int i = 0; i < vs.length; ++i) {
            d.put(cs.charAt(i), vs[i]);
        }
        int n = s.length();
        int ans = d.get(s.charAt(n - 1));
        for (int i = 0; i < n - 1; ++i) {
            int sign = d.get(s.charAt(i)) < d.get(s.charAt(i + 1)) ? -1 : 1;
            ans += sign * d.get(s.charAt(i));
        }
        return ans;
        // String roman = "IVXLCDM";
        // int[] romanValue = {1,5,10,50,100,500,1000};
        // Map<Character, Integer> romanMap = new HashMap<>();
        // for (int i = 0; i < romanValue.length; i++) {
        //     char ch = s.charAt(i);
        //     romanMap.put(ch, romanValue[i]);
        // }

        // int answer = romanMap.get(s.charAt(s.length() - 1));
        // for (int i = 0; i < s.length() - 1; ++i) {
        //     int sign = romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1)) ? -1 : 1;
        //     answer += sign * romanMap.get(s.charAt(i));
        // }
        // return answer;
    }
}
