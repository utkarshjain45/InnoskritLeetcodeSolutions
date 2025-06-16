import java.util.*;

public class prblm525 {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(nums));
    }

    public static int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int max = 0, sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
            else{
                int curr = i - map.get(sum);
                max = Math.max(max, curr);
            }
        }
        System.out.println(map);
        return max;
    }
}
