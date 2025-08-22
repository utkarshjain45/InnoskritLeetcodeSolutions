public class prblm231 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(new prblm231().isPowerOfTwo(n));
     
        int n2 = 0;
        System.out.println(new prblm231().isPowerOfTwo(n2));
    }

    public boolean isPowerOfTwo(int n) {
        while (n > 0) {
            if (n % 2 != 0) {
                break;
            }
            else{
                n /= 2;
            }
        }
        return n == 1;
    }
}
