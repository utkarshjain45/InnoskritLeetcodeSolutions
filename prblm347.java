import java.util.*;

public class prblm347 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(new prblm347().topKFrequent(nums, k)));
       
        int[] nums2 = {1};
        int k2 = 1;
        System.out.println(Arrays.toString(new prblm347().topKFrequent(nums2, k2)));
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer>[] list = new List[nums.length + 1];
        for (int num : map.keySet()) {
            int index = map.get(num);
            if (list[index] == null) {
                list[index] = new ArrayList<>();
            }
            list[index].add(num);
        }
        
        List<Integer> ans = new ArrayList<>();
        for (int i = list.length - 1; i >= 0 && ans.size() < k ; i--) {
            if (list[i] != null) {
                ans.addAll(list[i]);
            }
        }
        
        int[] arr = new int[k];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans.get(i);
        }
        
        return arr;
    }

    public int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] ans = new int[k];
        int i = 0;
        for(Map.Entry<Integer, Integer> entry : pq){
            ans[i] = entry.getKey();
            i++;
        }
        return ans;
    }
}
