import java.util.*;

public class prblm217 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(new prblm217().containsDuplicate(nums));
        
        int[] nums2 = {1,2,3,4};
        System.out.println(new prblm217().containsDuplicate2(nums2));

        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(new prblm217().containsDuplicate3(nums3));
    }

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.size() != i + 1){ 
                return true;
            }
        }
        return false;   
    }

    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            else{
                set.add(num);
            }
        }
        return false;
    }

    public boolean containsDuplicate3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }
}
