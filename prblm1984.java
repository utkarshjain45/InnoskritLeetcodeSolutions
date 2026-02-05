import java.util.Arrays;

public class prblm1984 {
    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        int k = 2;
        System.out.println(new prblm1984().minimumDifference(nums, k));
    }

    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - k + 1; i++){
            int min = nums[i];
            int max = nums[i + k - 1];
            diff = Math.min(diff, max - min);
        }
        return diff;
    }
}
