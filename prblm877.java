public class prblm877 {
    public static boolean stoneGame(int[] piles) {
        int score = solve(0, piles.length-1, piles);
        if(score > 0){
            return true;
        }
        return false;
    }
    private static int solve(int l, int r, int[] piles){
        if(l == r){
            return piles[l];
        }
        int left = piles[l] - solve(l + 1, r, piles);
        int right = piles[r] - solve(l, r - 1, piles);
        
        return Math.max(left, right);
    }
    public static void main(String[] args) {
        int[] piles = {5,3,4,5};
        System.out.println(stoneGame(piles));
    }
}
