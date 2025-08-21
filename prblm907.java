import java.util.Stack;

public class prblm907 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(new prblm907().sumSubarrayMins2(arr));
    }

    public int sumSubarrayMins(int[] arr) {
        int MOD = (int)1e9 + 7;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                min = Math.min(min, arr[j]);
                sum = (sum + min) % MOD;
            }
        }
        return (int) sum;
    }
    
    public int sumSubarrayMins2(int[] arr) {
        int[] prev = new int[arr.length];
        int[] next = new int[arr.length];
        int MOD = 1000000007;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            prev[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        stack.clear();
        
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            next[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }

        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            long count = (long) (i - prev[i]) * (next[i] - i);
            sum = (sum + (arr[i] * count) % MOD) % MOD;
        }
        return (int) sum;
    }
}
