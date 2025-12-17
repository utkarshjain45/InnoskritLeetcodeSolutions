public class prblm1008 {
    public static void main(String[] args) {
        int[] preorder = {8,5,1,7,10,12};
        TreeNode ans = new prblm1008().bstFromPreorder(preorder);
        new prblm1008().preOrder(ans);
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for(int val : preorder){
            root = makeBST(root, val);
        }
        return root;
    }

    private TreeNode makeBST(TreeNode root, int val){
        if(root == null) return new TreeNode(val);

        if(val < root.val){
            root.left = makeBST(root.left, val);
        }
        else{
            root.right = makeBST(root.right, val);
        }
        return root;
    }

    private void preOrder(TreeNode root){
        if(root == null) return;

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
