public class prblm28 {

    public static int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String str = haystack.substring(i, i + needle.length());
            if(str.equals(needle)){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String haystack = "geeksforgeeks"; 
        String needle = "for";
        System.out.println(strStr(haystack, needle));    
    }
}
