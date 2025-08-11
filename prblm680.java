public class prblm680 {
    public static void main(String[] args) {
        String arr = "aba";
        System.out.println(new prblm680().validPalindrome(arr));
        
        String s2 = "abca";
        System.out.println(new prblm680().validPalindrome(s2));
        
        String s3 = "abc";
        System.out.println(new prblm680().validPalindrome(s3));
    }

    private char[] arr;

    public boolean validPalindrome(String s) {
        this.arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while(i < j) {
            if (arr[i] != arr[j]) {
                return check(i + 1, j) || check(i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean check(int i, int j) {
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
