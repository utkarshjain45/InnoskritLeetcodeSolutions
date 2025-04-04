public class prblm287 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            int count = 0;
            for (int v : nums) {
                if (v <= mid) {
                    ++count;
                }
            }
            if (count > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

//Takes time complexity of O(n logn)

// Arrays.sort(nums);
// for (int i = 0; i < nums.length; i++) {
//     if (nums[i] == nums[i+1]) {
//         return nums[i];
//     }
// }
// return -1;


    // ans(nums);
    // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] != i+1) {
            // return nums[i];
        // }
    // }
    // return -1;
// }
// public static void ans(int[] nums){
    // int i=0;
    // while (i < nums.length) {
        // int corr = nums[i];
        // if (nums[i] != nums[corr]) {
            // swap(i, corr, nums);
        // }
        // else{
            // i++;
        // }
    // }
// }
// public static void swap(int i, int corr, int[] nums){
    // int temp = nums[i];
    // nums[i] = nums[corr];
    // nums[corr] = temp;
// }