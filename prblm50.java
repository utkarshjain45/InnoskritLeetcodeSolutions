public class prblm50 {
    public static void main(String[] args) {
        double x1 = 2.00000; int n1 = 10;
        double x2 = 2.10000; int n2 = 3;
        double x3 = 2.00000; int n3 = -2;
        double x4 = 1.00000; int n4 = 2147483647;
        System.out.println(myPow(x1, n1));
        System.out.println(myPow(x2, n2));
        System.out.println(myPow2(x3, n3));
        System.out.println(myPow2(x4, n4));
    }

    public static double myPow(double x, int n) {
        if(n == 0) return 1;

        long power = Math.abs((long)n);
        double ans = 1.0;
        for (long i = 0; i < power; i++) {
            ans = ans * x;
        }
        return n > 0 ? ans : 1.0 / ans;
    }

    public static double myPow2(double x, int n) {
        if(n == 0) return 1;

        long power = Math.abs((long)n);
        double ans = 1.0;

        while(power > 0){
            if(power % 2 == 1){
                ans *= x;
                power--;
            }
            else{
                power /= 2;
                x *= x;
            }
        }
        return n > 0 ? ans : 1.0 / ans;
    }
}