import java.util.*;

public class gfgStockSpan {

    public static void main(String args[]) {
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        ArrayList<Integer> ans = calculateSpan(arr);
        System.out.println(ans);
    }

    public static ArrayList<Integer> calculateSpan(int[] arr) {
        
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans.add(i - (-1));
            }
            else{
                ans.add(i - stack.peek());
            }
            stack.push(i);
        }
        return ans;
    }
}
