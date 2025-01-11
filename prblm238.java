public class prblm238 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = productExceptSelf(nums);
        for (int i : ans) {
            System.out.println(i);
        }
    }
    static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int prefix = 1; 
        for (int i = 0; i < answer.length; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }
        
        return answer;
    }
}
