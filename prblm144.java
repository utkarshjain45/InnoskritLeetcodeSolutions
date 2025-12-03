import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {}
    public TreeNode(int val){
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class prblm144 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = null;                 
        root.right = new TreeNode(2);     
        root.right.left = new TreeNode(3);
        root.right.right = null;

        System.out.println(new prblm144().preorderTraversal(root));
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preOrder(root, ans);
        return ans;
    }

    private void preOrder(TreeNode root, List<Integer> ans){
        if(root == null) return;

        ans.add(root.val);
        preOrder(root.left, ans);
        preOrder(root.right, ans);
    }
}
