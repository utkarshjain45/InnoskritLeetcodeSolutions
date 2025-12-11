public class prblm98 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(new prblm98().isValidBST(root));
    }

    public boolean isValidBST(TreeNode root) {
        return solve(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean solve(TreeNode root, long minimum, long maximum){
        if(root == null) return true;
        if(root.val <= minimum || root.val >= maximum) return false;
        return solve(root.left, minimum, root.val) 
            && solve(root.right, root.val, maximum);
    }
}
