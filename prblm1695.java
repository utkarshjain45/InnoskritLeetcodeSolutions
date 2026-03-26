import java.util.*;

public class prblm1695 {
    public static void main(String[] args) {
        int[] nums = {4,2,4,5,6};
        System.out.println(new prblm1695().maximumUniqueSubarray(nums));
    }

    public int maximumUniqueSubarray(int[] nums) {
        int start = 0, wSum = 0, answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int end = 0; end < nums.length; end++){
            wSum += nums[end];
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
            while(map.size() >= end - start + 1){
                answer = Math.max(answer, wSum);
                wSum -= nums[start];
                map.put(nums[start], map.get(nums[start]) - 1);
                if(map.get(nums[start]) == 0) map.remove(nums[start]);
                start++;
            }
        }
        return answer;
    }
}
