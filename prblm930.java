import java.util.*;

public class prblm930 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0};
        int goal = 0;
        System.out.println(numSubarraysWithSum(nums, goal));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
//        int sum = 0;
//        int count = 0;
//        Map<Integer,Integer> fMap = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            if(sum == goal){
//                count++;
//            }
//            if(fMap.containsKey(sum - goal)){
//                count += fMap.get(sum - goal);
//            }
//            fMap.put(sum, fMap.getOrDefault(sum,0) + 1);
//        }
//        return count;
        return solution(nums,goal) - solution(nums,goal-1);
    }
    public static int solution(int[] nums, int goal){
        int wStart=0, wSum=0, count=0;
        for (int wEnd = 0; wEnd < nums.length; wEnd++) {
            wSum += nums[wEnd];
            while(wStart <= wEnd && wSum > goal){
                wSum -= nums[wStart];
                wStart += 1;
            }
            count += (wEnd-wStart+1);
        }
        return count;
    }
}
