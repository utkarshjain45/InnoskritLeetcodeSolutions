public class prblm1437 {
    public static void main(String[] args) {
        int[] nums = {1,0,0,0,1,0,0,1};
        int k = 2;
        System.out.println(new prblm1437().kLengthApart(nums, k));
    }

    public boolean kLengthApart(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                    if (nums[j] == 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean kLengthApart2(int[] nums, int k) {
        int prev = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (i - prev - 1 < k) {
                    return false;
                }
                prev = i;
            }
        }
        return true;
    }
}
