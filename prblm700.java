public class prblm700 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        TreeNode ans = new prblm700().searchBST(root, 2);
        new prblm700().inOrder(ans);
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return root;
        if(root.val == val) return root;

        if(root.val > val) return searchBST(root.left, val);
        return searchBST(root.right, val);
    }

    public void inOrder(TreeNode root){
        if (root == null) return;

        System.out.print(root.val + " ");
        inOrder(root.left);
        inOrder(root.right);
    }
}
