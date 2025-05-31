import java.util.*;

public class prblm155 {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }
}

class MinStack {
        Stack<Long> stack;
        long min;
    public MinStack() {
        this.stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(0L);
            min = val;
        }
        else{
            long diff = (long) val - min;
            stack.push(diff);
            if(val < min){
                min = val;
            }
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) return;

        long diff = stack.pop();
        if(diff < 0){
            min = min - diff; 
        }
    }
    
    public int top() {
        long diff = stack.peek();
        if(diff >= 0){
            return (int) (diff + min);
        }
        else{
            return (int) min;
        }
    }
    
    public int getMin() {
        return (int) min;
    }
}
