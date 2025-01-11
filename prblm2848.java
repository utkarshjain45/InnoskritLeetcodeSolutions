import java.util.ArrayList;
import java.util.List;

public class prblm2848 {
    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(3);
        row1.add(6);
        nums.add(row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(5);
        nums.add(row2);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(4);
        row3.add(7);
        nums.add(row3);

        System.out.println(numberOfPoints(nums));
        
    }
    static int numberOfPoints(List<List<Integer>> nums) {
        int[] prefixSum = new int[102];
        for(List<Integer> num : nums){
            int left = num.get(0);
            int right = num.get(1);
            prefixSum[left] += 1;
            prefixSum[right+1] -= 1;
        }
        
        int count = 0;
        for (int i = 1; i < 102; i++) {
            prefixSum[i] = prefixSum[i-1] + prefixSum[i];
            if (prefixSum[i] > 0) {
                count += 1;
            }
        }
        return count;
    }
}
