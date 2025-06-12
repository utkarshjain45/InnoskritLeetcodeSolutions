public class prblm485 {

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else {
                count = 0;
            }
        }
        return maxCount;
    }

    // public int findMaxConsecutiveOnesUsingStack(int[] nums) {
    //     Stack<Integer> stack = new Stack<>();
    //     int count = 0;

    //     for(int i = 0; i < nums.length; i++){
    //         int tempCount = 0;
    //         while(!stack.isEmpty() && stack.peek() != 0){
    //             stack.pop();
    //             tempCount++;
    //         }
    //         count = Math.max(tempCount, count);
    //         stack.push(nums[i]);
    //     }
    //     return count;
    // }
}