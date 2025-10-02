import java.util.*;

class Pair {
    int score;
    int index;
    public Pair(int score, int index) {
        this.score = score;
        this.index = index;
    }
}

public class prblm506 {
    public static void main(String[] args) {
        int[] score = {5,4,3,2,1};
        System.out.println(Arrays.toString(new prblm506().findRelativeRanks2(score)));
        
        int[] score2 = {10,3,8,9,4};
        System.out.println(Arrays.toString(new prblm506().findRelativeRanks2(score2)));
    }

    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int sc : score){
            pq.add(sc);
        }
        
        Map<Integer, String> map = new HashMap<>();
        int i = 1;
        while(!pq.isEmpty()){
            if(i == 1) map.put(pq.poll(), "Gold Medal");
            else if(i == 2) map.put(pq.poll(), "Silver Medal");
            else if(i == 3) map.put(pq.poll(), "Bronze Medal");
            else{
                map.put(pq.poll(), String.valueOf(i));
            }
            i++;
        }
        String[] ans = new String[score.length];
        for(int j = 0; j < score.length; j++){
            ans[j] = map.get(score[j]);
        }
        return ans;
    }
    
    public String[] findRelativeRanks2(int[] score) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.score - a.score);
        for (int i = 0; i < score.length; i++) {
            pq.add(new Pair(score[i], i));
        }

        String[] ans = new String[score.length];
        for (int i = 1; i <= score.length; i++) {
            Pair pair = pq.poll();
            int index = pair.index;
            if (i == 1) ans[index] = "Gold Medal";
            else if (i == 2) ans[index] = "Silver Medal";
            else if (i == 3) ans[index] = "Bronze Medal";
            else ans[index] = String.valueOf(i);
        }
        return ans;
    }
}
