import java.util.Arrays;

public class prblm3379 {
    public static void main(String[] args) {
        int[] nums = {3, -2, 1, 1};
        System.out.println(Arrays.toString(new prblm3379().constructTransformedArray(nums)));
    }

    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            int idx = (i + nums[i]) % n;
            if(idx < 0){
                ans[i] = nums[idx + n];
            }
            else{
                ans[i] = nums[idx];
            }
        }
        return ans;
    }
}
