import java.util.*;

public class prblm26 {

    public static void main(String[] args) {
        int[] nums = {-3,-1,0,0,0,3,3};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }
    
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        List<Integer> sortedSet = new ArrayList<>(set);
        Collections.sort(sortedSet);  
        int idx = 0;
        for(int val : sortedSet){
            nums[idx] = val;
            idx++;
        }
        System.out.println(Arrays.toString(nums));
        return set.size();
    }
    
    public static int removeDuplicates2(int[] nums) {
        int idx = 0;
        for(int val : nums){
            if(idx == 0 || val != nums[idx - 1]){
                nums[idx] = val;
                idx++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return idx;
    }
}