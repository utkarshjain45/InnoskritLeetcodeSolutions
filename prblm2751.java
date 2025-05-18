import java.util.*;

class Robot{
    int position;
    int health;
    char direction;
    
    public Robot(int position, int health, char direction){
        this.position = position; 
        this.health = health; 
        this.direction = direction; 
    }
}

public class prblm2751 {
    public static List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Robot> robots = new ArrayList<>();
        for (int i = 0; i < positions.length; i++) {
            robots.add(new Robot(positions[i], healths[i], directions.charAt(i)));
        }
        robots.sort(Comparator.comparingInt(robot -> robot.position));

        Stack<Robot> stack = new Stack<>();
        for (Robot robot : robots) {
            boolean isDied = false;

            while (!stack.isEmpty() && stack.peek().direction == 'R' && robot.direction == 'L') {
                Robot lastRobot = stack.pop();
                if (lastRobot.health > robot.health) {
                    lastRobot.health -= 1;
                    stack.push(lastRobot);
                    isDied = true;
                    break;
                } else if (lastRobot.health == robot.health) {
                    isDied = true;
                    break;
                }else{
                    robot.health -= 1;
                }
            }
            if (isDied == false) {
                stack.push(robot);
            }
        }
        List<Integer> remainingRobotsHealth = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        
        while (!stack.isEmpty()) {
            Robot robot = stack.pop();
            map.put(robot.position, robot.health);
        }

        for (int pos : positions) {
            if(map.containsKey(pos)){
                remainingRobotsHealth.add(map.get(pos));
            }
        }
        return remainingRobotsHealth;
    }

    public static void main(String[] args) {
        int[] positions = {5,4,3,2,1};
        int[] healths = {2,17,9,15,10}; 
        String directions = "RRRRR";

        List<Integer> answer = survivedRobotsHealths(positions, healths, directions);
        System.out.println(answer.toString());
    }
}

// Solution 2
import java.util.*;

class Robot{
    int position;
    int health;
    char direction;
    int idx;
    
    public Robot(int position, int health, char direction,int idx){
        this.position = position; 
        this.health = health; 
        this.direction = direction; 
        this.idx = idx;
    }
}

public class prblm2751 {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Robot> robots = new ArrayList<>();
        for (int i = 0; i < positions.length; i++) {
            robots.add(new Robot(positions[i], healths[i], directions.charAt(i), i));
        }
        robots.sort(Comparator.comparingInt(robot -> robot.position));

        Stack<Robot> stack = new Stack<>();
        for (Robot robot : robots) {
            boolean isDied = false;

            while (!stack.isEmpty() && stack.peek().direction == 'R' && robot.direction == 'L') {
                Robot lastRobot = stack.pop();
                if (lastRobot.health > robot.health) {
                    lastRobot.health -= 1;
                    stack.push(lastRobot);
                    isDied = true;
                    break;
                } else if (lastRobot.health == robot.health) {
                    isDied = true;
                    break;
                }else{
                    robot.health -= 1;
                }
            }
            if (isDied == false) {
                stack.push(robot);
            }
        }

        List<Robot> aliveRobots = new ArrayList<>();
        while (!stack.isEmpty()) {
            aliveRobots.add(stack.pop());
        }
        aliveRobots.sort(Comparator.comparingInt(robot -> robot.idx));

        List<Integer> remainingRobotsHealth = new ArrayList<>();

        for (Robot robot : aliveRobots) {
            remainingRobotsHealth.add(robot.health);
        }

        return remainingRobotsHealth;
    }
    public static void main(String[] args) {
        int[] positions = {5,4,3,2,1};
        int[] healths = {2,17,9,15,10}; 
        String directions = "RRRRR";

        List<Integer> answer = survivedRobotsHealths(positions, healths, directions);
        System.out.println(answer.toString());
    }
}