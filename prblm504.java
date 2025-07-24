public class prblm504 {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(new prblm504().convertToBase7(num));
        
        int num2 = -7;
        System.out.println(new prblm504().convertToBase7(num2));
    }

    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        if (num < 0) {
            return "-" + convertToBase7(-num);
        }
        StringBuilder str = new StringBuilder();
        while (num != 0) {
            str.append(num % 7);
            num /= 7;
        }
        return str.reverse().toString();
    }
}
