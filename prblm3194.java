import java.util.Arrays;

public class prblm3194 {

    public static void main(String[] args) {
        int[] nums = {7,8,3,4,15,13,4,1};
        // int[] sortednums = {1,3,4,4,7,8,13,15};
        System.out.println(minimumAverage(nums));
    }

    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length - 1;
        double minAvg = Integer.MAX_VALUE;
        while (i <= j) {
            double avg = (double)((nums[i] + nums[j]) / 2.0);
            if(avg < minAvg){
                minAvg = avg;
            }
            i++;
            j--;
        }
        return minAvg;
    }
}