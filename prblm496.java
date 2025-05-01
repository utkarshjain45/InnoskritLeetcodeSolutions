import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class prblm496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=nums2.length-1; i >= 0; i--){
            int curr = nums2[i];
            while(!stack.isEmpty() && stack.peek() <= curr){
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(curr, -1);
            } else{
                map.put(curr, stack.peek());
            }
            stack.push(curr);
        }  
        int[] ans = new int[nums1.length];
        for(int i=0; i < nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        } 
        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] answer = nextGreaterElement(nums1, nums2);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
