public class prblm303 {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        int[][] sumRanges = {{0,2}, {2,5}, {0,5}};
        int[] prefixSum = calculatePrefixSum(nums);
        int[] answer = new int[nums.length];
        for(int[] sumRange : sumRanges ){
            int left = sumRange[0];
            int right = sumRange[1];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = sumRange(prefixSum, left, right);
            }
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
    
    static int[] calculatePrefixSum(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        return prefixSum;
    }
    
    static int sumRange(int[]prefixSum, int left, int right) {
        if (right == 0) {
            return prefixSum[right];
        }
        return prefixSum[right] - prefixSum[left-1];
    }
}