import java.util.*;

public class prblm3289 {
    public static void main(String[] args) {
        int[] nums = {0,3,2,1,3,2};
        System.out.println(Arrays.toString(new prblm3289().getSneakyNumbers(nums)));
    }

    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        int i = 0;
        for(int num : nums){
            if(set.contains(num)){
                ans[i] = num;
                i++;
            }
            set.add(num);
        }
        return ans;
    }
}
