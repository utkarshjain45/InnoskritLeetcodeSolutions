import java.util.*;

public class prblm846 {
    public static void main(String[] args) {
        
    }

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0){
            return false;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < hand.length; i++) {
            map.put(i, 0);
        }
        return true;
    }
}
