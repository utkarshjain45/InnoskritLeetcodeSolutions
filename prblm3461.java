public class prblm3461 {
    public static void main(String[] args) {
        String s = "3902";
        System.out.println(new prblm3461().hasSameDigits2(s));
        
        String s2 = "34789";
        System.out.println(new prblm3461().hasSameDigits2(s2));
    }

    public boolean hasSameDigits(String s) {
        String temp = s;
        while (temp.length() > 2) {
            StringBuilder str = new StringBuilder();
            
            for (int i = 0; i < temp.length() - 1; i++) {
                int a = temp.charAt(i) - '0';
                int b = temp.charAt(i + 1) - '0';
                str.append((a + b) % 10);
            }
            temp = str.toString();
        }
        System.out.println(temp);
        return temp.charAt(0) == temp.charAt(1);
    }
    
    public boolean hasSameDigits2(String s) {
        char[] arr = s.toCharArray();
        for (int i = arr.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                int a = arr[j] - '0';
                int b = arr[j + 1] - '0';
                arr[j] = (char) (((a + b) % 10) + '0');
            }
        }
        return arr[0] == arr[1];
    }
}
