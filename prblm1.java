public class prblm1 {
    public int maxProduct(int n) {
        int max1 = 0;
        int max2 = 0;
        while(n>0){
            int digit = n % 10;
            n = n / 10;

            if(digit > max1){
                max2 = max1;
                max1 = digit;
            }
            else if(digit > max2){
                max2 = digit;
            }
        }
        return max1 * max2;
    }
    public static void main(String[] args) {
        int n = 31;
        System.out.println(new prblm1().maxProduct(n));
    }
}
