public class prblm64{
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
    public static int minPathSum(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        return solve(grid, 0, 0, m, n);
    }

    public static int solve(int[][] grid, int i, int j, int m, int n){
        if (i == m-1 && j == n-1) {
            return grid[i][j];
        }
        if (i == m-1) {
            return grid[i][j] + solve(grid,i,j+1,m,n);
        }
        else if (j == n-1) {
            return grid[i][j] + solve(grid,i+1,j,m,n);
        }
        return grid[i][j] + Math.min(solve(grid, i+1, j, m, n), solve(grid, i, j+1, m, n));
    }
}