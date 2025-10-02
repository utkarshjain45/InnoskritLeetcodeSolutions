import java.util.*;

public class prblm120 {
    public static void main(String[] args) {
        int[][] triangle = {{2},{3,4},{6,5,7},{4,1,8,3}};
        System.out.println(new prblm120().minimumTotal(new prblm120().toList(triangle)));
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] arr = new int[triangle.size() + 1][triangle.size() + 1];
        for(int i = triangle.size() - 1; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                arr[i][j] = Math.min(arr[i+1][j], arr[i+1][j+1]) + triangle.get(i).get(j);
            }
        }
        return arr[0][0];
    }

    public int minimumTotal2(List<List<Integer>> triangle) {
        int[] arr = new int[triangle.size() + 1];
        for(int i = triangle.size() - 1; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                arr[j] = Math.min(arr[j], arr[j+1]) + triangle.get(i).get(j);
            }
        }
        return arr[0];
    }

    public List<List<Integer>> toList(int[][] triangle){
        List<List<Integer>> listTriangle = new ArrayList<>();
        for (int i = 0; i < triangle.length; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < triangle[i].length; j++) {
                row.add(triangle[i][j]);
            }
            listTriangle.add(row);
        }
        return listTriangle;
    }
}
