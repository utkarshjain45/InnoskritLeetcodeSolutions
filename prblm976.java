import java.util.Arrays;

public class prblm976 {
    public static void main(String[] args) {
        int[] nums = {2,1,2};
        System.out.println(new prblm976().largestPerimeter(nums));
    }

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            int circum = nums[i - 1] + nums[i - 2];
            if (circum > nums[i]) {
                return circum + nums[i];
            }
        }
        return 0;
    }
}
