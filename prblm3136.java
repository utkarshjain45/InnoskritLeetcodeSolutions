public class prblm3136 {
    public static void main(String[] args) {
        String word = "234Adas";
        System.out.println(new prblm3136().isValid(word));
        
        String word2 = "b3";
        System.out.println(new prblm3136().isValid(word2));
        
        String word3 = "a3$e";
        System.out.println(new prblm3136().isValid(word3));
    }

    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        boolean hasVowel = false, hasConsonant = false;
        boolean[] check = new boolean[26];
        for (char ch: "aeiou".toCharArray()) {
            check[ch - 'a'] = true;
        }

        for (char ch : word.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                if (check[Character.toLowerCase(ch) - 'a']) {
                    hasVowel = true;
                }
                else{
                    hasConsonant = true;
                }
            }
            else if(!Character.isDigit(ch)){
                return false;
            }
        }
        return hasVowel && hasConsonant;
    }
}
