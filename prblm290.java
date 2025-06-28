import java.util.*;

public class prblm290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
        
        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        System.out.println(wordPattern(pattern2, s2));

        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        System.out.println(wordPattern(pattern3, s3));

        String pattern4 = "abba";
        String s4 = "dog dog dog dog";
        System.out.println(wordPattern(pattern4, s4));

        String pattern5 = "aaa";
        String s5 = "aa aa aa aa";
        System.out.println(wordPattern(pattern5, s5));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length) return false;

        Map<Character, String> d1 = new HashMap<>();
        Map<String, Character> d2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            d1.put(pattern.charAt(i), arr[i]);
        }
        for (int i = 0; i < pattern.length(); i++) {
            d2.put(arr[i], pattern.charAt(i));
        }
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < pattern.length(); i++) {
            if(!d1.get(pattern.charAt(i)).equals(arr[i]) || d2.get(arr[i]) != pattern.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public boolean wordPattern2(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length) return false;

        Map<Character, String> d1 = new HashMap<>(); 
        Map<String, Character> d2 = new HashMap<>(); 
        
        for(int i = 0; i < pattern.length(); i++){
            if(!d1.getOrDefault(pattern.charAt(i), arr[i]).equals(arr[i]) || d2.getOrDefault(arr[i], pattern.charAt(i)) != pattern.charAt(i)){
                return false;
            }
            d1.put(pattern.charAt(i), arr[i]);
            d2.put(arr[i], pattern.charAt(i));
        }
        return true;
    }
}
