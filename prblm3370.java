public class prblm3370 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(new prblm3370().smallestNumber(n));
    }

    public int smallestNumber(int n) {
        for (int i = 1; i < n; i++) {
            int setBit = (int) (Math.pow(2, i) - 1);
            if (setBit >= n) {
                return setBit;
            }
        }
        return 0;
    }
    
    public int smallestNumber2(int n) {
        int i = 1;
        while(i - 1 < n){
            i <<= 1;
        }
        return i - 1;
    }
}