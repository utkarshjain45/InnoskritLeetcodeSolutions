import java.util.*;

public class prblm1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(new prblm1().twoSum(nums,target)));
        
        int[] nums2 = {3,2,4};
        int target2 = 6;
        System.out.println(Arrays.toString(new prblm1().twoSum(nums2,target2)));
    }

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    int a[] = {i,j};
                    return a;
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target - x;
            if(map.containsKey(y)){
                return new int[] {map.get(y), i};
            }
            map.put(x, i);
        }
        return null;
    }
}
