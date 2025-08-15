public class prblm121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(new prblm121().maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for (int num : prices) {
            profit = Math.max(profit, num - min);
            min = Math.min(min, num);
        }
        return profit;
    }   
}
