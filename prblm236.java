import java.util.*;

public class prblm236 {
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left;
        TreeNode q = root.right;
        System.out.println(new prblm236().lowestCommonAncestor(root, p, q).val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();
        solve(root, p, pathP);
        solve(root, q, pathQ);
        TreeNode ans = null;
        for (int i = 0; i < Math.min(pathP.size(), pathQ.size()); i++) {
            if (pathP.get(i).val == pathQ.get(i).val) {
                ans = pathP.get(i);
            }
        }
        return ans;
    }

    private boolean solve(TreeNode root, TreeNode p, List<TreeNode> path){
        if (root == null) return false;
        path.add(root);
        if(root.val == p.val) return true;
        if(solve(root.left, p, path) || solve(root.right, p, path)){
            return true;
        }
        else{
            path.remove(path.size() - 1);
            return false;
        }
    }
}
