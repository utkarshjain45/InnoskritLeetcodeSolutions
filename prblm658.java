import java.util.*;

public class prblm658 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 4, x = 3;
        System.out.println(findClosestElements2(arr, k, x).toString());
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        List<int[]> list = new ArrayList<>();
        for (int num : arr) {
            list.add(new int[]{Math.abs(num - x), num});
        }
        Collections.sort(list, (a, b) -> {
            if(a[0] != b[0]){
                return a[0] - b[0];
            }
            else{
                return a[1] - b[1];
            }
        });
        for (int i = 0; i < k; i++) {
            ans.add(list.get(i)[1]);
        }
        Collections.sort(ans);
        return ans;
    }
    
    public static List<Integer> findClosestElements2(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if(a[0] != b[0]){
                return b[0] - a[0];
            }
            else{
                return b[1] - a[1];
            }
        });
        for (int num : arr) {
            pq.add(new int[]{Math.abs(num - x), num});
            if (pq.size() > k) {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            ans.add(pq.poll()[1]);
        }
        Collections.sort(ans);
        return ans;
    }
}
