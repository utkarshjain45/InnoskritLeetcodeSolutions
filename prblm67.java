public class prblm67 {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        StringBuilder first = new StringBuilder(a);
        first.reverse();
        StringBuilder second = new StringBuilder(b);
        second.reverse();

        int carry = 0;

        for (int i = 0; i < Math.max(first.length(), second.length()); i++) {
            char firstBit = (i < first.length()) ? first.charAt(i) : '0';
            char secondBit = (i < second.length()) ? second.charAt(i) : '0';

            int sum = (firstBit - '0') + (secondBit - '0') + carry;

            if (sum == 0) {
                str.append('0');
                carry = 0;
            }
            else if(sum == 1){
                str.append('1');
                carry = 0;
            }
            else if(sum == 2){
                str.append('0');
                carry = 1;
            }
            else if(sum == 3){
                str.append('1');
                carry = 1;
            }
        }
        if(carry == 1){
            str.append('1');
        }
        return str.reverse().toString();
    }
}
