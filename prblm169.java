public class prblm169 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int count = 0, max = 0;
        for (int x : nums) {
            if (count == 0) {
                max = x;
                count = 1;
            } else {
                if (max == x) {
                    count += 1;
                } else {
                    count -= 1;
                }
            }
        }
        return max;
    }
}
