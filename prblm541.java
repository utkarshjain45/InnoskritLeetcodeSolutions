public class prblm541 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(new prblm541().reverseStr(s, k));
       
        String s2 = "abcd";
        int k2 = 2;
        System.out.println(new prblm541().reverseStr(s2, k2));
    }

    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i += k * 2) {
            int r = Math.min(i + k - 1, s.length() - 1);
            for (int l = i; l < r; l++) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                r--;
            }
        }
        return new String(arr);
    }
}
