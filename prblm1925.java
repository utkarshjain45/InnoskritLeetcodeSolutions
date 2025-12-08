public class prblm1925 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(new prblm1925().countTriples(n));
    }

    public int countTriples(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                double root = Math.sqrt((i * i) + (j * j));
                if (root == (int)root && root <= n) {
                    count += 2;
                }
            }
        }
        return count;
    }
}
