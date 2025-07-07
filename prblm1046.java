import java.util.*;

public class prblm1046 {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight2(stones));
        
        int[] stones1 = {1};
        System.out.println(lastStoneWeight2(stones1));
    }

    public static int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int num : stones) {
            list.add(num);
        }
        while (list.size() > 1) {
            Collections.sort(list);
            int x = list.remove(list.size() - 1);
            int y = list.remove(list.size() - 1);
            if(x != y){
                list.add(Math.abs(y - x));
            }
        }
        return list.size() == 0 ? 0 : list.get(0);
    }
    
    public static int lastStoneWeight2(int[] stones) {
        PriorityQueue<Integer> list = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : stones) {
            list.add(num);
        }
        while (list.size() > 1) {
            int x = list.poll();
            int y = list.poll();
            if(x != y){
                list.add(x - y);
            }
        }
        return list.isEmpty() ? 0 : list.peek();
    }
}
