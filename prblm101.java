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

public class prblm101 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(new prblm101().isSymmetric(root));
    }

    public boolean isSymmetric(TreeNode root) {
        return solve(root.left, root.right);
    }

    public boolean solve(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return solve(p.left, q.right) && solve(p.right, q.left);
    }
}
