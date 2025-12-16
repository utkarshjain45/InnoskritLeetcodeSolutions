import java.util.*;

public class prblm653 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        System.out.println(new prblm653().findTarget(root, 9));
    }

    private boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return solve(root, set, k);
    }
    
    private boolean solve(TreeNode root, Set<Integer> set, int k){
        if(root == null) return false;
        
        int x = root.val;
        int y = k - x;
    
        if (set.contains(y)) {
            return true;
        }

        set.add(root.val);

        return solve(root.left, set, k) || solve(root.right, set, k);
    }
}
