import java.util.*;

public class prblm230 {
    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);


        System.out.println(new prblm230().kthSmallest(root, 3));
    }
    
    public int kthSmallest(TreeNode root, int k) {
        dfs(root);    
        Collections.sort(list);
        return list.get(k - 1);
    }

    private void dfs(TreeNode root){
        if(root == null) return;

        list.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}
