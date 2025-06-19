import java.util.*;

public class prblm901 {
    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        System.out.print(stockSpanner.next(100) + " "); 
        System.out.print(stockSpanner.next(80) + " ");  
        System.out.print(stockSpanner.next(60) + " ");  
        System.out.print(stockSpanner.next(70) + " ");  
        System.out.print(stockSpanner.next(60) + " ");  
        System.out.print(stockSpanner.next(75) + " ");  
        System.out.print(stockSpanner.next(85) + " ");  
    }
}
class StockSpanner {
    Stack<int[]> stack;

    public StockSpanner() {
        stack =  new Stack<>();
    }

    public int next(int price) {
        int count = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            count += stack.pop()[1];
        }
        stack.push(new int[] {price, count});
        return count;
    }
}