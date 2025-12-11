public class prblm701 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        new prblm701().inOrder(root);
        System.out.println();

        TreeNode ans = new prblm701().insertIntoBST(root, 5);
        new prblm701().inOrder(ans);
    }

    private TreeNode insertIntoBST(TreeNode root, int val){
        if (root == null) return new TreeNode(val);

        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        }
        else{
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    private void inOrder(TreeNode root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
}
