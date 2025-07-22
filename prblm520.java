import java.util.*;

public class prblm520 {
    public static void main(String[] args) {
        String word = "USA";
        System.out.println(new prblm520().detectCapitalUse(word));
        
        String word2 = "FlaG";
        System.out.println(new prblm520().detectCapitalUse(word2));
        
        String word3 = "g";
        System.out.println(new prblm520().detectCapitalUse(word3));
        
        String word4 = "ffffffffffffffffffffF";
        System.out.println(new prblm520().detectCapitalUse(word4));
    }

    public boolean detectCapitalUse(String word) {
        Map<String , Integer> map = new HashMap<>();
        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                map.put("upper", map.getOrDefault("upper", 0) + 1);
            }
            else if (Character.isLowerCase(ch)) {
                map.put("lower", map.getOrDefault("lower", 0) + 1);
            }
        }
        if (map.containsKey("upper") && !map.containsKey("lower")) {
            return true;
        }
        else if (map.containsKey("lower") && !map.containsKey("upper")) {
            return true;
        }
        else if (map.get("upper") == 1 && map.get("lower") > 0 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }
        return false;
    }

    public boolean detectCapitalUse2(String word) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        if (count == 0 || count == word.length() || (count == 1 && Character.isUpperCase(word.charAt(0)))) {
            return true;
        }
        return false;
    }
}
