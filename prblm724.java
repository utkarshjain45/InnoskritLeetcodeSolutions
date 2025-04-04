public class prblm724 {
    public static void main(String[] args) {
        int[] arr = {-1,-1,0,1,1,0};
        System.out.println(pivotIndex(arr));
    }
    public static int pivotIndex(int[] nums) {
        int left=0, right=0, sum=0;
        for(int num:nums){
            sum = sum + num;
        }
        for(int i=0; i<=nums.length-1; i++){
            if (i == 0){
                if ((sum-nums[i]) == 0) {
                    return 0;
                }
            }
            else {
                left = left + nums[i-1];
                right = sum - left - nums[i];
                if(i == nums.length-1){
                    if(left == 0){
                        return i;
                    }
                }
                if(left == right){
                    return i;
                }
            }
        }
        return -1;
    }
}
