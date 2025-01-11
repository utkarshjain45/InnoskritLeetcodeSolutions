public class prblm1109 {
    public static void main(String[] args) {
        int[][] bookings = {{1,2,10}, {2,3,20}, {2,5,25}};
        int n = 5;
        int[] answer = corpFlightBookings(bookings, n);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
    static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] prefixSum = new int[n+2];
        for (int i=0; i< bookings.length; i++) {
            int[] booking = bookings[i];
            int left = booking[0];
            int right = booking[1];
            prefixSum[left] += booking[2];  
            prefixSum[right+1] -= booking[2];  
        }
        return calculatePrefixSum(prefixSum);
    }
    static int[] calculatePrefixSum(int[] prefixSum){
        int[] calculatedPrefixSum = new int[prefixSum.length-2];
        calculatedPrefixSum[0] = prefixSum[1];
        for (int i = 1; i < calculatedPrefixSum.length; i++) {
            calculatedPrefixSum[i] = calculatedPrefixSum[i-1] + prefixSum[i+1];
        }
        return calculatedPrefixSum;
    }
}