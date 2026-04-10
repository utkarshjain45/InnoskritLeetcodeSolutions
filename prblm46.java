import java.util.ArrayList;
import java.util.List;

public class prblm46 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(new prblm46().permute(nums));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> list, int[] nums){
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
        }
        else{
            for(int i = 0; i < nums.length; i++){
                if(list.contains(nums[i])) continue;

                list.add(nums[i]);
                backtrack(ans, list, nums);
                
                list.remove(list.size() - 1);
            }
        }
    }
}
