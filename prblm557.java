public class prblm557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.print(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        s = String.join(" ", words);
        return s;
    }
}  



//  StringBuilder result = new StringBuilder();       
//         int i = 0;       
//         while (i < s.length()) {
//             int j = i;
//             while (j < s.length() && s.charAt(j) != ' ') {
//                 j++;
//             }
//             for (int k = j - 1; k >= i; k--) {
//                 result.append(s.charAt(k));
//             }   
//             if (j < s.length()) {
//                 result.append(' ');
//             }
//             i = j + 1;
//         }
//         return result.toString();