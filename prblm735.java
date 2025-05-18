import java.util.*;

public class prblm735 {
    
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            boolean currAstrExp = false;

            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                int lastAsteroid = stack.pop();
                if (lastAsteroid > (asteroid * -1)) {
                    stack.push(lastAsteroid);
                    currAstrExp = true;
                    break;
                } else if (lastAsteroid == (asteroid * -1)) {
                    currAstrExp = true;
                    break;
                }
            }
            if (currAstrExp == false) {
                stack.push(asteroid);
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}