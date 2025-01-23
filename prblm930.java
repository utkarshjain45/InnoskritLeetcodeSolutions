import java.util.HashMap;
import java.util.Map;

public class prblm930 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0};
        int goal = 0;
        System.out.println(numSubarraysWithSum(nums, goal));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int count=0, sum=0;
        Map<Integer, Integer> fMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum == goal){
                count++;
            }
            if(fMap.containsKey(sum - goal)){
                count += fMap.get(sum-goal);
            }
            fMap.put(sum, fMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
