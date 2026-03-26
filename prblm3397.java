import java.util.*;

public class prblm3397 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,4};
        int k = 2;
        System.out.println(new prblm3397().maxDistinctElements(nums, k));
        
        int[] nums2 = {4,4,4,4};
        int k2 = 1;
        System.out.println(new prblm3397().maxDistinctElements(nums2, k2)); 
        
        int[] nums3 = {8,8,10,9,9};
        int k3 = 1;
        System.out.println(new prblm3397().maxDistinctElements(nums3, k3)); 
    }

    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0, pre = Integer.MIN_VALUE;
        for (int x : nums) {
            int cur = Math.min(x + k, Math.max(x - k, pre + 1));
            if (cur > pre) {
                ++ans;
                pre = cur;
            }
        }
        return ans;
    }
    public int maxDistinctElements2(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                count++;
            }
            else{
                for (int j = (-1) * k; j <= k; j++) {
                    int newNum = nums[i] + j; 
                    if (!set.contains(newNum)) {
                        set.add(newNum);
                        count++;
                        break;
                    }
                }
            }
            System.out.println(set);
        }
        return count;
    }
}
