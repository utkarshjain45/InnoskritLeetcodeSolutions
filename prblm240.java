public class prblm240 {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        System.out.println(new prblm240().searchMatrix(matrix, target));
        
        int[][] matrix2 = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target2 = 20;
        System.out.println(new prblm240().searchMatrix2(matrix2, target2));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = 0;
        int cols = matrix[0].length - 1;

        while(rows < matrix.length && cols >= 0){
            if(matrix[rows][cols] == target){
                return true;
            }
            if(matrix[rows][cols] > target){
                cols--;
            }
            else{
                rows++;
            }
        }
        return false;
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        int low = 0, high = 0;
        for(int[] arr : matrix){
            low = 0;
            high = arr.length - 1;

            while(low <= high){
                int mid = high + (low - high) / 2;
                if(arr[mid] == target){
                    return true;
                }
                if(arr[mid] > target){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return false;
    }
}
