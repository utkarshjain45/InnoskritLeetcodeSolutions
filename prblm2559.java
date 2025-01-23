import java.util.Set;

public class prblm2559 {
    public static void main(String[] args) {
        String[] words = {"aba","bcb","ece","aa","e"};
        int[][] queries = {{0,2}, {1,4}, {1,1}};
        int[] ans = vowelStrings(words, queries);
        for (int i : ans) {
            System.out.println(i);
        }
    }
    // static int[] vowelStrings(String[] words, int[][] queries) {
    //     for (int[] query : queries) {
    //         int left = query[0];
    //         int right = query[1];
    //     }
    // }
    // static int calculateNoOfVowels(int[] words, int left, int right){
    //     for (int i = left; i < right; i++) {
    //         if () {
                
    //         }
    //     }
    // }
    public static int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int n = words.length;
        int[] s = new int[n + 1];
        for (int i = 0; i < n; ++i){
            char a = words[i].charAt(0);
            char b = words[i].charAt(words[i].length() - 1);
            s[i + 1] = s[i] + (vowels.contains(a) && vowels.contains(b) ? 1 : 0);
        }
        int m = queries.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; ++i){
            int left = queries[i][0];
            int right = queries[i][1];
            ans[i] = s[right + 1] - s[left];
        }
        return ans;
    }
}