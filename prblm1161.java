import java.util.LinkedList;
import java.util.Queue;

public class prblm1161 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(-100);
        root.left = new TreeNode(-200);
        root.right = new TreeNode(-300);
        root.left.left = new TreeNode(-20);
        root.left.right = new TreeNode(-5);
        root.right.left = new TreeNode(-10);
        
        System.out.println(new prblm1161().maxLevelSum(root));
    }


    //Optimised Solution
    public int maxLevelSum(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int maxSum = Integer.MIN_VALUE;
        int idx = 1;
        int ans = 0;

        while (!queue.isEmpty()) {
            int sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                sum += curr.val;
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            if (sum > maxSum) {
                maxSum = sum;
                ans = idx;
            }
            idx++;
        }
        return ans;
    }

    //Unoptimised Solution
    // public int maxLevelSum(TreeNode root){
    //     List<List<Integer>> list = bfs(root);
    //     int ans = 1;
    //     int maxSum = Integer.MIN_VALUE;
    //     for (int i = 0; i < list.size(); i++) {
    //         int sum = list.get(i).stream().mapToInt(Integer::intValue).sum();
    //         if (sum > maxSum) {
    //             maxSum = sum;
    //             ans = i + 1;
    //         }
    //     }
    //     return ans;
    // }
    
    // private List<List<Integer>> bfs(TreeNode root){
    //     List<List<Integer>> list = new ArrayList<>();
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     queue.add(root);

    //     while (!queue.isEmpty()) {
    //         List<Integer> currList = new ArrayList<>();
    //         int size = queue.size();
    //         for (int i = 0; i < size; i++) {
    //             TreeNode curr = queue.poll();
    //             currList.add(curr.val);
    //             if (curr.left != null) {
    //                 queue.add(curr.left);
    //             }
    //             if (curr.right != null) {
    //                 queue.add(curr.right);
    //             }
    //         }
    //         list.add(currList);
    //     }
    //     return list;
    // }
}