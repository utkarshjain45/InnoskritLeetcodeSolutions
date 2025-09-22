import java.util.HashMap;
import java.util.Map;

public class prblm3005 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};
        System.out.println(new prblm3005().maxFrequencyElements(nums));
        
        int[] nums2 = {10,12,11,9,6,19,11};
        System.out.println(new prblm3005().maxFrequencyElements(nums2));
    }

    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        } 
        
        System.out.println(map);
        int count = 0, max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(max < entry.getValue()){
                count = 0;
                count += entry.getValue();
            }
            else if(max == entry.getValue()){
                count += entry.getValue();
            }
            max = Math.max(max, entry.getValue());
        }
        return count;
    }

    public int maxFrequencyElements2(int[] nums) {
        int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }
        int ans = 0, max = -1;
        for (int num : count) {
            if (max < num) {
                max = num;
                ans = num;
            } else if (max == num) {
                ans += num;
            }
        }
        return ans;
    }
}
