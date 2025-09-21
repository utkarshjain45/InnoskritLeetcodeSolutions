public class prblm74 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(new prblm74().searchMatrix(matrix, target));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0, high = rows * cols - 1;
    
        while(low <= high){
            int mid = low + (high - low) / 2;
            int x = mid / cols;
            int y = mid % cols;
            if(matrix[x][y] == target){
                return true;
            }
            if(matrix[x][y] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }
}
