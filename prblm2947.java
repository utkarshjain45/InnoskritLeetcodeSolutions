import java.util.*;

public class prblm2947 {
    public static void main(String[] args) {
        String s = "baeyh";
        int k = 2;
        System.out.println(beautifulSubstrings(s, k));
    }
    public static int beautifulSubstrings(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int count = 0;
        for(int i=0; i<s.length(); i++){
            int vowelsCount = 0;
            int consonant = 0;
            for(int j=i; j<s.length(); j++){
                if(vowels.contains(s.charAt(j))){
                    vowelsCount++;
                }
                else{
                    consonant++;
                }
                if (vowelsCount == consonant && ((vowelsCount*consonant) % k == 0)) {
                    count++;
                }
            }
        }
        return count;
    }
}
