import java.util.*;

public class prblm2845 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(4);
        int modulo = 2;
        int k = 1;
        System.out.println(countInterestingSubarrays(nums, modulo, k));
    }

    public static long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        Map<Long,Long> sumFreqMap = new HashMap<>();
        long prefixCount = 0l;
        long subArrayCount = 0l;
        sumFreqMap.put(0l,1l);
        for(int i = 0; i<nums.size(); i++){
            if(nums.get(i) % modulo == k){
                prefixCount += 1;
            }
            if(sumFreqMap.containsKey((prefixCount - k) % modulo)){
                subArrayCount += sumFreqMap.get((prefixCount - k) % modulo);
            }
            sumFreqMap.put(prefixCount % modulo, sumFreqMap.getOrDefault(prefixCount % modulo, 0l) + 1);
        }
        return subArrayCount; 
    }
}
