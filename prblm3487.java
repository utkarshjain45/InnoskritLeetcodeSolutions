import java.util.*;

public class prblm3487 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(new prblm3487().maxSum(nums));
        
        int[] nums2 = {1,1,0,1,1};
        System.out.println(new prblm3487().maxSum(nums2));
        
        int[] nums3 = {1,2,-1,-2,1,0,-1};
        System.out.println(new prblm3487().maxSum(nums3));

        int[] nums4 = {-17,-15};
        System.out.println(new prblm3487().maxSum(nums4));
    }

    public int maxSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
        }
        if (max < 0) return max;

        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]) || nums[i] < 0) {
                continue;
            }
            else{
                set.add(nums[i]);
                sum += nums[i];
            }
        }
        return sum;
    }
}
