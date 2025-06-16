public class prblm2566 {
    public static void main(String[] args) {
        int num = 11891;
        System.out.println(minMaxDifference(num));
    }

    public static int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int min = Integer.parseInt(s.replace(s.charAt(0), '0'));
        for (char ch : s.toCharArray()) {
            if (ch != '9') {
                return Integer.parseInt(s.replace(ch, '9')) - min;
            }
        }
        return num - min;
    }
}
