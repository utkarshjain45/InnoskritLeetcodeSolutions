import java.util.*;

public class prblm2200 {

    public static void main(String[] args) {
        int[] arr = {3,4,9,1,3,9,5};
        int key = 9;
        int k = 1;
        List<Integer> ans = findKDistantIndices(arr, key, k);
        System.out.println(ans);
    }

    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (Math.abs(i - j) <= k && nums[j] == key) {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}