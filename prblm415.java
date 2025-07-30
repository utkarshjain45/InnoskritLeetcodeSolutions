public class prblm415 {
    public static void main(String[] args) {
        String num1 = "11", num2 = "123";
        System.out.println(new prblm415().addStrings(num1, num2));
        
        String num3 = "456", num4 = "77";
        System.out.println(new prblm415().addStrings(num3, num4));
    }

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1;
        StringBuilder str = new StringBuilder();
        for(int c = 0; i >= 0 || j >= 0 || c > 0 ;i--, j--){
            int a = i < 0 ? 0 : num1.charAt(i) - '0';
            int b = j < 0 ? 0 : num2.charAt(j) - '0';
            c += a + b;
            str.append(c % 10);
            c /= 10;
        }
        return str.reverse().toString();
    }
}
