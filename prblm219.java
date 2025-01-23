import java.util.HashMap;
import java.util.Map;

public class prblm219 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.size() != i + 1){ 
                return true;
            }
        }
        return false;
    }
}
