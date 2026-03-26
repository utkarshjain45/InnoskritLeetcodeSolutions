public class prblm1523 {

    public static void main(String[] args) {
        int low = 3, high = 7;
        System.out.println(new prblm1523().countOdds(low, high));
    }

    public int countOdds(int low, int high) {
        int diff = high - low + 1;
        if (diff % 2 == 0) {
            return diff / 2;
        }
        return (int)Math.ceil(diff / 2);   
    }
}