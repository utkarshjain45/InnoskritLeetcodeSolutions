import java.util.*;

public class prblm205 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
        System.out.println(isIsomorphic2(s, t));

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(isIsomorphic(s2, t2));
        System.out.println(isIsomorphic2(s2, t2));

        String s3 = "paper";
        String t3 = "title";
        System.out.println(isIsomorphic(s3, t3));
        System.out.println(isIsomorphic2(s3, t3));
        
        String s4 = "badc";
        String t4 = "baba";
        System.out.println(isIsomorphic(s4, t4));
        System.out.println(isIsomorphic2(s4, t4));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            if (map2.containsKey(t.charAt(i)) && map2.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            }
            map.put(s.charAt(i), t.charAt(i));
            map2.put(t.charAt(i), s.charAt(i));
        }
        return true;   
    }

    public static boolean isIsomorphic2(String s, String t) {
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (arr1[a] != arr2[b]) {
                return false;
            }
            arr1[a] = i + 1;
            arr2[b] = i + 1;
        }
        return true;   
    }
}
