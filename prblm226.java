public class prblm226 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        new prblm226().inOrder(root);
        System.out.println();
        TreeNode node = new prblm226().invertTree(root);
        new prblm226().inOrder(node);
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;
        return root;
    }

    public void inOrder(TreeNode root){
        if (root == null) return;
        System.out.print(root.val + " ");
        inOrder(root.left);
        inOrder(root.right);
    }
}