public class prblm1578 {
    public static void main(String[] args) {
        String colors = "aaabbbabbbb";
        int[] neededTime = {3,5,10,7,5,3,5,5,4,8,1};
        System.out.println(new prblm1578().minCost(colors, neededTime));
    }

    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int maxTime = neededTime[0];
        for(int i = 1; i < colors.length(); i++){
            if(colors.charAt(i - 1) == colors.charAt(i)){
                totalTime += Math.min(maxTime, neededTime[i]);
                maxTime = Math.max(maxTime, neededTime[i]);
            }
            else{
                maxTime = neededTime[i];
            }
        }
        return totalTime;
    }
}
