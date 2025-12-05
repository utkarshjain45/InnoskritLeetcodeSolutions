import java.util.*;

public class prblm1018 {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,1};
        System.out.println(new prblm1018().prefixesDivBy5(nums));
    }

    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            str.append(nums[i]);
            int num = Integer.parseInt(str.toString(), 2);
            if (num % 5 == 0) {
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}
