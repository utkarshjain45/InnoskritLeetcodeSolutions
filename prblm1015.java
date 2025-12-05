public class prblm1015 {
    public static void main(String[] args) {
        int k = 23;
        System.out.println(new prblm1015().smallestRepunitDivByK(k));
    }

    public int smallestRepunitDivByK(int k) {
        int num = 1;
        for(int i = 1; i <= k; i++){
            if (num % k == 0) {
                return i;
            }
            num = (num * 10 + 1) % k;
        }
        return -1;
    }
}
