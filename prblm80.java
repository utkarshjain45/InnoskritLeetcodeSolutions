public class prblm80 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(new prblm80().removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int x : nums) {
            if (k < 2 || x != nums[k - 2]) {
                nums[k++] = x;
            }
        }
        return k;
    }
}
