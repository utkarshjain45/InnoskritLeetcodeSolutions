public class prblm392 {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));

        String s2 = "axc", t2 = "ahbgdc";
        System.out.println(isSubsequence(s2, t2));
    }

    public static boolean isSubsequence(String s, String t) {
        int i =0, j = 0;
        while(i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
