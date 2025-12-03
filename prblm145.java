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

public class prblm145 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = null;                 
        root.right = new TreeNode(2);     
        root.right.left = new TreeNode(3);
        root.right.right = null;

        System.out.println(new prblm145().postorderTraversal(root));
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postOrder(root, ans);
        return ans;
    }

    private void postOrder(TreeNode root, List<Integer> ans){
        if(root == null) return;

        postOrder(root.left, ans);
        postOrder(root.right, ans);
        ans.add(root.val);
    }
}
