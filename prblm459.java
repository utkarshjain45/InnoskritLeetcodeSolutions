public class prblm459 {
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(repeatedSubstringPattern(s));
        
        String s2 = "aba";
        System.out.println(repeatedSubstringPattern(s2));
        
        String s3 = "abcabcabc";
        System.out.println(repeatedSubstringPattern(s3));

        String s4 = "a";
        System.out.println(repeatedSubstringPattern(s4));
    }

    public static boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String trim = doubled.substring(1, doubled.length() - 1);
        return trim.contains(s);
    }
}
