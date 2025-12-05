public class prblm3512 {
    public static void main(String[] args) {
        int[] nums = {3,9,7};
        int k = 5;
        System.out.println(new prblm3512().minOperations(nums, k));
    }

    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        int opr = 0;
        while(sum % k != 0){
            sum--;
            opr++;
        }
        return opr;
    }
}
