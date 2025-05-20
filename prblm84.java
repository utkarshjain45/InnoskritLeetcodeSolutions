import java.util.*;

public class prblm84 {
    public static int[] nextSmallerToRight(int[] arr){
        int[] nser = new int[arr.length];
		Stack<Integer> stack = new Stack<>();

		for(int i = arr.length - 1; i >= 0; i--) {
		    while(!stack.empty() && arr[stack.peek()] >= arr[i]) {
    			stack.pop();
    		}
    		if(stack.empty()) {
    		    nser[i] = arr.length;
    		}
    		else  {
    		    nser[i] = stack.peek();
    		}
			stack.push(i);
		}
		return nser;
    }

    public static int[] nextSmallerToLeft(int[] arr){
        int[] nsel = new int[arr.length];
		Stack<Integer> stack = new Stack<>();

		for(int i = 0; i < arr.length; i++) {
		    while(!stack.empty() && arr[stack.peek()] >= arr[i]) {
    			stack.pop();
    		}
    		if(stack.empty()) {
    		    nsel[i] = -1;
    		}
    		else  {
    		    nsel[i] = stack.peek();
    		}
			stack.push(i);
		}
		return nsel;
    }

    public static int largestRectangleArea(int[] heights) {
        int[] nsel = nextSmallerToLeft(heights);
        int[] nser = nextSmallerToRight(heights);
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int area = (nser[i] - nsel[i] - 1) * heights[i];
            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}