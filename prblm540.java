import java.util.*;

public class prblm540 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicateUsingMap(nums));
        System.out.println(singleNonDuplicateUsingXOR(nums));
        System.out.println(singleNonDuplicate(nums));
        System.out.println(singleNonDuplicateUsingBinarySearch(nums));
    }

    public static int singleNonDuplicateUsingMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == 1){
                return nums[i];
            }
        }
        return -1;
    }


    public static int singleNonDuplicateUsingXOR(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }


    public static int singleNonDuplicate(int[] nums) {
        for(int i = 0; i < nums.length - 1; i = i + 2){
            if(nums[i] != nums[i + 1]){
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }


    public static int singleNonDuplicateUsingBinarySearch(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while(l < r){
            int mid = (l + r) >> 1;
            if(nums[mid] != nums[mid ^ 1]){
                r = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return nums[l];
    }
}
