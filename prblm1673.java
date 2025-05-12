import java.util.Arrays;
import java.util.Stack;

public class prblm1673 {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack <Integer> stack = new Stack<>();
        int removable = nums.length - k;
        for(int i = 0; i < nums.length; i++){
            while(!stack.isEmpty() && stack.peek() > nums[i] && removable > 0){
                stack.pop();
                removable--;
            }
            stack.push(nums[i]);
        }

        while(removable > 0){
            stack.pop();
            removable--;
        }

        int[] ans = new int[k];
        for(int i = k-1; i >= 0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,5,2,6}; 
        int k = 2;
        System.out.println(Arrays.toString(new prblm1673().mostCompetitive(nums, k)));
    }
}
