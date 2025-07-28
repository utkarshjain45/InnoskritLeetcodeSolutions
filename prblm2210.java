public class prblm2210 {
    public static void main(String[] args) {
        int[] nums = {2,4,1,1,6,5};
        System.out.println(new prblm2210().countHillValley(nums));

        int[] nums2 = {6,6,5,5,4,1};
        System.out.println(new prblm2210().countHillValley(nums2));
    }

    public int countHillValley(int[] nums) {
        int ans = 0, j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            else if(nums[i] > nums[j] && nums[i] > nums[i + 1]){
                ans++;
            }
            else if(nums[i] < nums[j] && nums[i] < nums[i + 1]){
                ans++;
            }
            j = i;
        }
        return ans;
    }
}
