import java.util.Arrays;
import java.util.Collections;

public class prblm3074 {
    public static void main(String[] args) {
        int[] apple = {1,3,2}, capacity = {4,3,1,5,2};
        System.out.println(new prblm3074().minimumBoxes(apple, capacity));
    }

    public int minimumBoxes(int[] apple, int[] capacity) {
        int total = 0;
        for(int num : apple){
            total += num;
        }

        Integer[] cap = new Integer[capacity.length];
        for (int i = 0; i < cap.length; i++) {
            cap[i] = capacity[i];
        }

        Arrays.sort(cap, Collections.reverseOrder());

        int count = 0;
        for (int num : cap) {
            if (total <= 0) {
                return count;
            }
            total -= num;
            count++;
        }
        return count;
    }
}
