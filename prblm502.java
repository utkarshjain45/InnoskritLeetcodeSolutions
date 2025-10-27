import java.util.Arrays;
import java.util.PriorityQueue;

public class prblm502 {
    public static void main(String[] args) {
        int k = 2, w = 0;
        int[] profit = {1,2,3}, capital = {0,1,1};
        System.out.println(new prblm502().findMaximizedCapital(k, w, profit, capital));
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int[][] projects = new int[profits.length][2];
        for (int i = 0; i < profits.length; i++) {
            projects[i][0] = profits[i];
            projects[i][1] = capital[i];
        }
        Arrays.sort(projects, (a,b) -> a[1] - b[1]);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        int i = 0;
        while (k-- > 0) {
            while (i < profits.length && projects[i][1] <= w) {
                pq.add(projects[i][0]);
                i += 1;
            }
            if (!pq.isEmpty()) {
                w += pq.poll();
            }
        }
        return w;
    }
}
