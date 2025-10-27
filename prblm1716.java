public class prblm1716 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(new prblm1716().totalMoney(n));
    }

    public int totalMoney(int n) {
        int total = 0;
        int k = (n / 7) + 1;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= 7; j++) {
                total += 1;
            }
        }
        return total;
    }
}
