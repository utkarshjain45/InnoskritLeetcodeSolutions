public class prblm1744 {
    public static void main(String[] args) {
        //Here a Test Case is passed in the function
        int[] candiesCount = {5,2,6,4,1};
        int[][] queries = {{3,1,2},{4,10,3},{3,10,100},{4,100,30},{1,3,1}};
        boolean[] answer = canEat(candiesCount, queries);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    static boolean[] canEat(int[] candiesCount, int[][] queries) {
        //Answer for the leetcode to be copied from here
        long[] PrefixCount = calculatePrefixSum(candiesCount);

        boolean[] answer = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int favCandy = query[0];
            long favDay = query[1];
            long dailyCap = query[2];

            long totalCandiesToBeEatenBefore = (favCandy == 0) ? 0 : PrefixCount[favCandy-1];

            if (totalCandiesToBeEatenBefore >= (favDay+1) * dailyCap) {
                answer[i] = false;
            }
            else if ((favDay+1) > PrefixCount[favCandy]) {
                answer[i] = false;
            }
            else{
                answer[i] = true;
            }
        }
        return answer;
    }
    static long[] calculatePrefixSum(int[] nums) {
        long[] prefixSum = new long[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        return prefixSum;
    }
}