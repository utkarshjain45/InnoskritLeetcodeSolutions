public class prblm1343 {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        System.out.println(numOfSubarrays(arr, k, threshold));
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowStart = 0; 
        int windowSum = 0;
        int count = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= (k-1)) {
                if (windowSum/k >= threshold) {
                    count++;
                }
                windowSum -= arr[windowStart];
                windowStart += 1;
            }
        }
        return count;
    }
}
