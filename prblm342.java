public class prblm342 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(new prblm342().isPowerOfFour(n));
    }


    public boolean isPowerOfFour(int n) {
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }
}