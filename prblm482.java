public class prblm482 {
    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        System.out.println(new prblm482().licenseKeyFormatting(s, k));

        String s2 = "2-5g-3-J";
        int k2 = 2;
        System.out.println(new prblm482().licenseKeyFormatting(s2, k2));
        
        String s3 = "a-a-a-a-";
        int k3 = 1;
        System.out.println(new prblm482().licenseKeyFormatting(s3, k3));
        
        String s4 = "--a-a-a-a--";
        int k4 = 2;
        System.out.println(new prblm482().licenseKeyFormatting(s4, k4));
        
        String s5 = "---";
        int k5 = 3;
        System.out.println(new prblm482().licenseKeyFormatting(s5, k5));
    }
    public String licenseKeyFormatting(String s, int k) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch != '-') {
                count++;
            }
        }
        count %= k;
        if (count == 0) count = k;

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '-') {
                continue;
            }
            str.append(Character.toUpperCase(ch));
            count--;

            if (count == 0) {
                count = k;
                if (i != s.length() - 1) {
                    str.append('-');
                }
            }
        }
        if (str.length() > 0 && str.charAt(str.length() - 1) == '-') {
            str.deleteCharAt(str.length() - 1);
        }
        return str.toString();
    }

    public String licenseKeyFormatting2(String s, int k) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch != '-') {
                count++;
            }
        }
        count %= k;
        if (count == 0) count = k;

        StringBuilder str = new StringBuilder();
        

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '-') {
                continue;
            }
            str.append(Character.toUpperCase(ch));
            count--;

            if (count == 0) {
                int lookahead = i + 1;
                while (lookahead < s.length() && s.charAt(lookahead) == '-') {
                    lookahead++;
                }

                if (lookahead < s.length()) {
                    str.append('-');
                }
                count = k;
            }
        }
        return str.toString();
    }
}
