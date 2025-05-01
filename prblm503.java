import java.util.Stack;

public class prblm503 {

    public static int[] nextGreaterElements(int[] nums) {
       int[] tempArr = new int[nums.length * 2];
       for (int i = 0; i < nums.length; i++) {
            tempArr[i] = nums[i];
            tempArr[i + nums.length] = nums[i];
       }

        Stack<Integer> stack = new Stack<>();
        int[] tempAns = new int[nums.length * 2];

        for (int i = tempArr.length-1; i >= 0; i--) {
            int curr = tempArr[i];
            while(!stack.isEmpty() && stack.peek() <= curr){
                stack.pop();
            }
            if(!stack.isEmpty()){
                tempAns[i] = stack.peek();
            }
            else{
                tempAns[i] = -1;
            }
            stack.push(curr);
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = tempAns[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] answer = nextGreaterElements(nums);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}