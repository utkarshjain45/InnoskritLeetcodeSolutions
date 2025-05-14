import java.util.*;

public class prblm739 {

    public static void main(String[] args) {
        int[] arr = {89,62,70,58,47,47,46,76,100,70};
        int[] answer = NextGreaterToRight(arr);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    public static int[] NextGreaterToRight(int[] nums){

        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];

        for (int i = nums.length-1; i >= 0; i--) {
            int curr = nums[i];
            while(!stack.isEmpty() && nums[stack.peek()] <= curr){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return ans;
    }

}